(ns ogbe.fulcro.mui.icons.image-aspect-ratio
  #?(:cljs (:require
            ["@mui/icons-material/ImageAspectRatio" :default ImageAspectRatio]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-image-aspect-ratio
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImageAspectRatio)))