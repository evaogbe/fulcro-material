(ns ogbe.fulcro.mui.icons.image-search-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ImageSearchRounded" :default ImageSearchRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-image-search-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImageSearchRounded)))