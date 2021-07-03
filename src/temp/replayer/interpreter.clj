
(defn update-history [world]
  (update-in world [:replay-history]
             #(conj % {:parts (:parts world)
                       :camera (:camera world)})))

(defn get-part-type [part-name]
  (keyword (second (re-find #":([a-z]*)" (str part-name)))))

(defn run-add-instruction [world instruction]
  (let [[_ part-name
         _ parent-name
         _ position rotation] (read-string (str "[" instruction "]"))
        part-name (keyword part-name)
        parent-name (keyword parent-name)
        type (get-part-type part-name)
        layer (apply min (:visible-layers world))
        color (get-in world [:info type :color])
        part (create-part type color layer (:info world))
        transform (make-transform position rotation)
        prepare-wagon (fn [w]
                        (if (= type :wagon)
                          (set-wagon-loop w part-name parent-name)
                          w))]
    (-> world                           
      (assoc-in [:parts part-name] part)
      (assoc-in [:parts parent-name :children part-name] transform)
      (prepare-wagon)
      (compute-transforms :parts)
      (update-history)
      (tree-changed))))

;; (defn run-set-instruction [world instruction]
;;   (let [[_ property-name
;;          _ part-name
;;          _ value] (read-string (str "[" instruction "]"))
;;         property-name (keyword property-name)
;;         part-name (keyword part-name)
;;         value (if (symbol? value) (keyword value) value)]
;;     (-> world
;;         (set-part-value part-name property-name (str value))
;;         (update-history)
;;         (tree-changed))))

(defn scale-animation [world animation]
  (let [{:keys [t start-scale final-scale
                start-transform final-transform
                part-name parent-name]} animation]
    (cond
      (float= t 0.0)
      (tree-will-change world)

      (float= t 1.0)
      (-> world
          (assoc-in [:parts part-name :scale] final-scale)
          (assoc-in [:parts part-name :transform] final-transform)
          (create-relative-transform part-name parent-name)
          (update-history)
          (tree-changed))

      :else
      (let [scale (vector-interpolate start-scale final-scale t)
            transform (interpolate-transforms start-transform
                                              final-transform t)]
        (-> world
            (assoc-in [:parts part-name :scale] scale)
            (assoc-in [:parts part-name :transform] transform))))))

(defn run-scale-instruction [world instruction]
  (let [[_ part-name
         _ change] (read-string (str "[" instruction "]"))
        part-name (keyword part-name)
        parent-name (get-parent-part world part-name)
        part (get-in world [:parts part-name])
        offset (cond
                 (= (:type part) :track)
                 change

                 (and
                   (in? (:type part) [:cylinder :cone])
                   (float= (second change) 0.0))
                 [0 0 0]

                 (= (:type part) :sphere)
                 [0 0 0]

                 :else
                 (vector-multiply change 0.5))

        rotation (get-rotation-component (:transform part))
        offset (apply-transform rotation offset)
        offset-transform (make-transform offset [1 0 0 0])
        transform (:transform part)
        final-transform (combine-transforms transform offset-transform)]
    (assoc-in world [:animation]
      {:t 0.0
       :time 0.3
       :fn scale-animation
       :part-name part-name
       :parent-name parent-name
       :start-scale (:scale part)
       :final-scale (vector-add (:scale part) change)
       :start-transform transform
       :final-transform final-transform})))

(defn run-set-color-instruction [world instruction]
  (let [[_ _ _ part-name _ color] (read-string (str "[" instruction "]"))
        color (keyword color)
        part-name (keyword part-name)
        world (assoc-in world [:parts part-name :color] color)
        part (get-in world [:parts part-name])
        world (if (= (:type part) :lamp)
                (assoc-in world [:parts part-name :dark-color]
                  (get-dark-color color))
                world)]
    (-> world
      (update-history)
      (tree-changed))))

(defn value-animation [world animation]
  (let [{:keys [t part-name start-value final-value]} animation]
    (cond
      (float= t 0.0)
      (tree-will-change world)

      (float= t 1.0)
      (-> world
        (assoc-in [:parts part-name :value] final-value)
        (update-history)
        (tree-changed)
        (redraw))

      :else
      (-> world
        (assoc-in [:parts part-name :value]
          (interpolate-values start-value final-value t))
        (redraw)))))

(defn run-set-value-instruction [world instruction]
  (let [[_ _ _ part-name _ value] (read-string (str "[" instruction "]"))
        part-name (keyword part-name)
        part (get-in world [:parts part-name])
        start-value (:value part)
        length (if (= (:type part) :wagon)
                 (reduce + (:track-lengths part))
                 1)
        final-value (/ value length)
        s-value (* (:value part) length)
        time (abs (- s-value value))

        time (if (= (:type part) :wagon)
               time
               (* time 3))]
    (assoc-in world [:animation]
      {:t 0.0
       :time time
       :fn value-animation
       :part-name part-name
       :start-value start-value
       :final-value final-value})))

;; (defn interpolate-mouse [start end]
;;   (let [ts (last start)
;;         te (last end)
;;         start (take 2 start)
;;         end (take 2 end)
;;         d (distance start end)
;;         v (vector-subtract end start)
;;         interval (- te ts)
;;         dt 20.0
;;         num-steps (int (/ interval dt))
;;         extra-time (int (mod interval dt))]
;;     (robot-move start)
;;     (dotimes [i (dec num-steps)]
;;       (sleep dt)
;;       (robot-move (vector-add start (vector-multiply v (/ i num-steps)))))
;;     (sleep extra-time)
;;     (robot-move end)))

;; (defn run-mouse-instruction [world instruction]
;;   (let [[_ button & points] (read-string (str "(" instruction ")"))
;;         button (keyword button)]

;;     (.start
;;      (new Thread
;;           (proxy [Runnable] []
;;             (run []
;;               (robot-set-active! true)
;;               (robot-move (take 2 (first points)))
;;               (robot-mouse-press button)
;;               (dotimes [i (dec (count points))]
;;                 (interpolate-mouse (nth points i)
;;                                    (nth points (inc i))))
;;               (sleep 16)
;;               (robot-mouse-release button)
;;               (sleep 100) ;;##########################
;;               (robot-set-active! false)
;;               ))))
;;     world))

(defn run-sleep-instruction [world instruction]
  (sleep (parse-int (subs instruction 6)))
  world)

(defn run-set-variable-instruction [world instruction]
  (let [[_ _ key _ value] (read-string (str "(" instruction ")"))
        key (keyword key)
        value (if (symbol value)
                (keyword value)
                value)
        world (if (in? key [:selected-part
                            :selected-chip
                            :selected-motherboard])
                (select-part world value)
                world)]
    (-> world
      (assoc-in [key] value)
      (update-history))))

(declare replaying)

(defn run-put-instruction [world instruction]
  (let [[_ part-name _ chip-name] (read-string (str "[" instruction "]"))
        part-name (keyword part-name)
        chip-name (keyword chip-name)
        chip (get-in world [:parts chip-name])
        part (get-in world [:parts part-name])]
    (if (nil? part)
      (do
        (println! "part" part-name "doesn't exist")
        (reset! replaying false)
        world)
      (-> world
        (select-part part-name)
        (assoc-in [:parts chip-name :functions part-name]
          {:points [[0 0] [1 1]]
           :relative false
           :z (inc (get-max-z chip))})
        (update-history)
        (tree-changed)))))

(defn run-add-point-instruction [world instruction]
  (let [[_ _ point _ _ part-name _ chip-name] (read-string (str "[" instruction "]"))
        part-name (keyword part-name)
        chip-name (keyword chip-name)]
    (-> world
      (update-in [:parts chip-name :functions part-name]
        (fn [function]
          (-> function
            (update-in [:points] #(conj % point))
            (normalize-function))))
      (update-history))))

(defn run-move-point-instruction [world instruction]
  (let [[_ _ n _ _ part-name _ chip-name _ point] (read-string (str "[" instruction "]"))
        part-name (keyword part-name)
        chip-name (keyword chip-name)]
    (-> world
      (update-in [:parts chip-name :functions part-name]
        (fn [function]
          (-> function
            (assoc-in [:points n] point)
            (normalize-function))))
      (update-history))))

(defn function-zoom-animation [world animation]
  (let [{:keys [t chip-name start-view end-view]} animation]
    (cond
      (float= t 0.0) world

      (float= t 1.0)
      (-> world
        (assoc-in [:parts chip-name :view] end-view)
        (update-history)
        (redraw))

      :else
      (let [start-zoom [(:zoom-x start-view)
                        (:zoom-y start-view)]
            end-zoom [(:zoom-x end-view)
                      (:zoom-y end-view)]
            zoom (vector-interpolate start-zoom end-zoom t)
            offset (vector-interpolate
                     (:offset start-view) (:offset end-view) t)]
        (-> world
          (assoc-in [:parts chip-name :view]
            {:zoom-x (first zoom)
             :zoom-y (second zoom)
             :offset offset})
          (redraw))))))

(defn run-set-view-instruction [world instruction]
  (let [[_ _ _ chip-name _ view] (read-string (str "[" instruction "]"))
        [ox oy zx zy] view
        chip-name (keyword chip-name)
        chip (get-in world [:parts chip-name])
        start-view (:view chip)
        end-view  {:zoom-x zx
                   :zoom-y zy
                   :offset [ox oy]}]
    (assoc-in world [:animation]
      {:t 0.0
       :time 1
       :fn function-zoom-animation
       :chip-name chip-name
       :start-view start-view
       :end-view end-view})))

(defn run-activate-instruction [world instruction]
  (let [chip-name (keyword (second (split instruction #" ")))]
    (activate-chip world chip-name)))

(defn run-select-instruction [world instruction]
  (let [[_ motherboard-name _ tab-num] (read-string (str "[" instruction "]"))
        motherboard-name (keyword motherboard-name)]
    (-> world
      (assoc-in [:parts motherboard-name :tab] tab-num)
      (redraw)
      (update-history))))

(defn run-set-pin-instruction [world instruction]
  (let [[_ motherboard-name _ pin] (read-string (str "[" instruction "]"))
        motherboard-name (keyword motherboard-name)
        [part-name x] pin
        part-name (keyword part-name)
        part (get-in world [:parts part-name])]
    (if (nil? part)
      (do
        (println! "part" part-name "doesn't exist")
        (reset! replaying false)
        world)
      (-> world
        (assoc-in [:parts motherboard-name :pins part-name]
          {:x x
           :trigger false
           :value (:value part)})
        (redraw)
        (update-history)))))

(defn run-toggle-instruction [world instruction]
  (let [[_ motherboard-name _ part-name] (read-string (str "[" instruction "]"))
        motherboard-name (keyword motherboard-name)
        part-name (keyword part-name)]
    (-> world
      (assoc-in [:parts motherboard-name :pins part-name :trigger] true)
      (redraw)
      (update-history))))

(defn run-set-gate-instruction [world instruction]
  (let [[_ motherboard-name _ gate] (read-string (str "[" instruction "]"))
        motherboard-name (keyword motherboard-name)
        tab (get-in world [:parts motherboard-name :tab])
        [gate-name x y] gate
        type (->> gate-name
               (str)
               (re-find #"([a-z]*)[0-9]*")
               (second)
               (keyword))
        gate-name (keyword (str "gate-" gate-name))]
    (-> world
      (assoc-in [:parts motherboard-name :gates gate-name]
        {:type type
         :x x
         :y y
         :tab tab})
      (redraw)
      (update-history))))

(defn run-set-connection-instruction [world instruction]
  (let [[_ motherboard-name _ connection-name points] (read-string (str "[" instruction "]"))
        motherboard-name (keyword motherboard-name)
        connection-name (keyword connection-name)
        points (vec (map #(if (symbol? %)
                            (keyword %)
                            %)
                      points))
        tab (get-in world [:parts motherboard-name :tab])]
    (-> world
      (assoc-in [:parts motherboard-name :connections connection-name]
        {:points points
         :tab tab})
      (redraw)
      (update-history))))

(defn run-add-connection-point-instruction [world instruction]
  (let [[_ motherboard-name connection-name _ point] (read-string (str "[" instruction "]"))
        motherboard-name (keyword motherboard-name)
        connection-name (keyword connection-name)
        point (if (symbol? point)
                (keyword point)
                point)]
    (-> world
      (update-in [:parts motherboard-name
                  :connections connection-name :points]
        #(conj % point))
      (redraw)
      (update-history))))

(defn run-instruction [world instruction]
  (let [words (split instruction #" ")
        instruction-name (cond
                           (= (second words) "point")
                           (str (first words) "-point")

                           (.startsWith instruction "set motherboard")
                           (str (first words) "-" (third words))
                           
                           (= (first words) "set")
                           (str (first words) "-" (second words))

                           (and
                             (= (first words) "add")
                             (= (fourth words) "point"))
                           "add-connection-point"

                           :else
                           (first words))]
    (if-let [function (-> (str "temp.core/run-"
                               instruction-name
                               "-instruction")
                          (symbol)
                          (resolve))]
      (do
        (println! (subs instruction 0 (min 100 (count instruction))))
        (-> world
          (function instruction)
          (redraw)))
      (do
        (println! "invalid instruction")
        world))))
