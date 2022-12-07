(ns ogbe.fulcro.mui.surfaces.card-content
  #?(:cljs (:require
            ["@mui/material/CardContent" :default CardContent]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-card-content #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory CardContent)))
