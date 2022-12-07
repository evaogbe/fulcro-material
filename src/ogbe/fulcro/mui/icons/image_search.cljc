(ns ogbe.fulcro.mui.icons.image-search
  #?(:cljs (:require
            ["@mui/icons-material/ImageSearch" :default ImageSearch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-image-search
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImageSearch)))