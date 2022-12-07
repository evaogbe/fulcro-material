(ns ogbe.fulcro.mui.icons.accessibility-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AccessibilitySharp" :default AccessibilitySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-accessibility-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessibilitySharp)))