(ns ogbe.fulcro.mui.icons.wrap-text-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WrapTextOutlined" :default WrapTextOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wrap-text-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WrapTextOutlined)))