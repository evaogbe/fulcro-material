(ns ogbe.fulcro.mui.icons.settings-accessibility
  #?(:cljs (:require
            ["@mui/icons-material/SettingsAccessibility" :default SettingsAccessibility]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-accessibility
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsAccessibility)))