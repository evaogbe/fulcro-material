(ns ogbe.fulcro.mui.icons.settings-input-composite
  #?(:cljs (:require
            ["@mui/icons-material/SettingsInputComposite" :default SettingsInputComposite]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-input-composite
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsInputComposite)))