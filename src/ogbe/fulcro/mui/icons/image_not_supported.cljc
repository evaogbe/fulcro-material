(ns ogbe.fulcro.mui.icons.image-not-supported
  #?(:cljs (:require
            ["@mui/icons-material/ImageNotSupported" :default ImageNotSupported]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-image-not-supported
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImageNotSupported)))