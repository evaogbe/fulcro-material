(ns ogbe.fulcro.mui.layout.iimage-list-item-bar
  #?(:cljs (:require
            ["@mui/material/ImageListItemBar" :default ImageListItemBar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-image-list-item-bar #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory ImageListItemBar)))
