(ns ogbe.fulcro.mui.icons.accessibility-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AccessibilityRounded" :default AccessibilityRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-accessibility-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessibilityRounded)))