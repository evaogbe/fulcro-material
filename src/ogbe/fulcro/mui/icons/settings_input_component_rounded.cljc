(ns ogbe.fulcro.mui.icons.settings-input-component-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SettingsInputComponentRounded" :default SettingsInputComponentRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-input-component-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsInputComponentRounded)))