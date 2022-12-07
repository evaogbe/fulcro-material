(ns ogbe.fulcro.mui.icons.image-search-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ImageSearchOutlined" :default ImageSearchOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-image-search-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImageSearchOutlined)))