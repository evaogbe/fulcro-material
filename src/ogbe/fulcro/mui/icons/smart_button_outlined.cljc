(ns ogbe.fulcro.mui.icons.smart-button-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SmartButtonOutlined" :default SmartButtonOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smart-button-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartButtonOutlined)))