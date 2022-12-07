(ns ogbe.fulcro.mui.icons.settings-cell
  #?(:cljs (:require
            ["@mui/icons-material/SettingsCell" :default SettingsCell]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-cell
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsCell)))