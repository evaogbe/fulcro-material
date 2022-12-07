(ns ogbe.fulcro.mui.icons.settings-bluetooth
  #?(:cljs (:require
            ["@mui/icons-material/SettingsBluetooth" :default SettingsBluetooth]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-bluetooth
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsBluetooth)))