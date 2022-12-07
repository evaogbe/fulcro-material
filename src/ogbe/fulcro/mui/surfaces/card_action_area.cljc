(ns ogbe.fulcro.mui.surfaces.card-action-area
  #?(:cljs (:require
            ["@mui/material/CardActionArea" :default CardActionArea]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-card-action-area #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory CardActionArea)))
