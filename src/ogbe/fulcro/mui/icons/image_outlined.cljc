(ns ogbe.fulcro.mui.icons.image-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ImageOutlined" :default ImageOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-image-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImageOutlined)))