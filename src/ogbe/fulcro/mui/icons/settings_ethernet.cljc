(ns ogbe.fulcro.mui.icons.settings-ethernet
  #?(:cljs (:require
            ["@mui/icons-material/SettingsEthernet" :default SettingsEthernet]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-ethernet
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsEthernet)))