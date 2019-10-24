
;; (defn draw-square-function! [graph-box function color]
;;   (let [{:keys [x y w h]} graph-box]
;;     (doseq [i (range 1 (count function))]
;;       (let [p1 (nth function (dec i))
;;             p2 (nth function i)
;;             h1 (second p1)
;;             h2 (second p2)
;;             [x1 y1] (local->global graph-box p1)
;;             [x2 y2] (local->global graph-box p2)]
;;         (draw-line! color x1 y1 x2 y1)
;;         (fill-circle! color x2 y2 7)
;;         (draw-line! :gray x2 y1 x2 y2)
;;         (if (= i 1)
;;           (fill-circle! color x1 y1 7))))))

;; (defn one-transition? [function start-time end-time]
;;   (let [pairs (map vector function (rest function))
;;         p1 (find-if (fn [[[t0 & _] [t1 & _]]]
;;                         (<= t0 start-time t1))
;;                     pairs)
;;         p2 (find-if (fn [[[t0 & _] [t1 & _]]]
;;                         (<= t0 end-time t1))
;;                       pairs)
;;         [[_ y0] [_ y1]] p1
;;         [[_ y2] [_ _]] p2]
;;     (or (vector= [y0 y1 end-time] [0 1 1])
;;         (vector= [y0 y1 y2] [0 1 1]))))

;; (if (= (:type part) :chip)
;;   (if (one-transition? function old-time time)
;;     (assoc-in world [:parts part-name :time] 0.0)
;;     world)
;;   world)

;; (defn square-function-collision [function t v]
;;   (let [segments (map vector function (rest function))
;;         corners (map (fn [[[_ y1] [x2 _]]]
;;                        [x2 y1])
;;                      segments)
;;         new-function (butlast (interleave function
;;                                           (conj (vec corners)
;;                                                 nil)))]
;;     (function-collision new-function t v)))
