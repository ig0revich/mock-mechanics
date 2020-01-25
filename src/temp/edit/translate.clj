
(ns temp.core)

(defn translate-mode-pressed [world event]
  (let [x (:x event)
        y (:y event)]
    (if-let [part-name (:part-name (get-part-collision world x y))]
      (assoc-in world [:edited-part] part-name)
      world)))

(defn translate-mode-moved [world event]
  (if-let [part-name (:edited-part world)]
    (let [x (:x event)
          y (:y event)
          part (get-in world [:parts part-name])]
      (if (= (:type part) :wagon)
        world
        (let [subtree (get-limited-tree (:parts world) part-name [])]
          (if-let [spec (get-closest-spec world x y subtree)]
            (let [offset (get-part-offset part)
                  parent-name (:part spec)
                  parent (get-in world [:parts parent-name])
                  transform (spec->transform offset spec parent)]
              (println! spec)
              (-> world
                  (assoc-in [:parts part-name :transform] transform)
                  (assoc-in [:parent-name] parent-name)))
            world))))
    world))

(declare set-wagon-loop)

(defn translate-mode-released [world event]
  (if-let [part-name (:edited-part world)]
    (let [x (:x event)
          y (:y event)
          part (get-in world [:parts part-name])
          new-parent-name (:parent-name world)
          old-parent-name (get-parent-part world part-name)
          world (-> world
                    (dissoc-in [:parts old-parent-name
                                :children part-name])
                    (dissoc-in [:edited-part]))]
      (if (= (:type part) :wagon)
        (let [track-name (get-part-at world x y)
              transform (get-in world [:parts track-name :transform])]
          (-> world
              (assoc-in [:parts part-name :transform] transform)
              (assoc-in [:parts track-name :children part-name]
                        (make-transform [0 0 0] [1 0 0 0]))
              (set-wagon-loop part-name track-name)))
        (create-relative-transform world part-name new-parent-name)))
    world))
