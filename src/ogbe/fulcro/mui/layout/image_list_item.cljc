(ns ogbe.fulcro.mui.layout.image-list-item
  #?(:cljs (:require
            ["@mui/material/ImageListItem" :default ImageListItem]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-image-list-item #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory ImageListItem)))
