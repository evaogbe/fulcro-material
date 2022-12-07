(ns ogbe.fulcro.mui.surfaces.card-media
  #?(:cljs (:require
            ["@mui/material/CardMedia" :default CardMedia]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-card-media #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory CardMedia)))
