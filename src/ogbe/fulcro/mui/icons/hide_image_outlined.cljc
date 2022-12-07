(ns ogbe.fulcro.mui.icons.hide-image-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HideImageOutlined" :default HideImageOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hide-image-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HideImageOutlined)))