(ns hooks.my-ns
  (:require [clj-kondo.hooks-api :as hooks]))

(defn special-map
  [{{[_ & args] :children} :node}]
  (let [[_map-type m] (if (= (count args) 1)
                       [(first args) (hooks/map-node [])]
                       args)]
    {:node m}))
