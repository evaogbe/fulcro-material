(ns ogbe.fulcro.mui.layout.image-list
  #?(:cljs (:require
            ["@mui/material/ImageList" :default ImageList]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-image-list #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory ImageList)))
