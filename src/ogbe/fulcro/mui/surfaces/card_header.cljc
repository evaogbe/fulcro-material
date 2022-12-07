(ns ogbe.fulcro.mui.surfaces.card-header
  #?(:cljs (:require
            ["@mui/material/CardHeader" :default CardHeader]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-card-header #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory CardHeader)))
