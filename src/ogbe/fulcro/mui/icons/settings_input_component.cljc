(ns ogbe.fulcro.mui.icons.settings-input-component
  #?(:cljs (:require
            ["@mui/icons-material/SettingsInputComponent" :default SettingsInputComponent]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-input-component
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsInputComponent)))