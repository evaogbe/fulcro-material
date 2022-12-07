(ns ogbe.fulcro.mui.icons.accessibility-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AccessibilityOutlined" :default AccessibilityOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-accessibility-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessibilityOutlined)))