(ns ogbe.fulcro.mui.surfaces.card-actions
  #?(:cljs (:require
            ["@mui/material/CardActions" :default CardActions]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-card-actions #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory CardActions)))
