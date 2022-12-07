(ns ogbe.fulcro.mui.icons.image-search-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ImageSearchSharp" :default ImageSearchSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-image-search-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImageSearchSharp)))