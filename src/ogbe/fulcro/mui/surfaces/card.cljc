(ns ogbe.fulcro.mui.surfaces.card
  #?(:cljs (:require
            ["@mui/material/Card" :default Card]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-card #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Card)))
