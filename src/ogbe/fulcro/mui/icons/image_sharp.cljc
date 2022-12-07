(ns ogbe.fulcro.mui.icons.image-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ImageSharp" :default ImageSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-image-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImageSharp)))