(ns my-ns)

(defmacro special-map [_map-type m]
  m)

(defn x []
  (let [num-cans 2]
    (assoc (special-map :world-map {:description (format "%d cans" num-cans)}) :wow :ok)))
