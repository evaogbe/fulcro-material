(ns ogbe.fulcro.mui.icons.image-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ImageRounded" :default ImageRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-image-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImageRounded)))