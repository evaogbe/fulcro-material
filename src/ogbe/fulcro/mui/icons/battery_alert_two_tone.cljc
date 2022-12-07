(ns ogbe.fulcro.mui.icons.battery-alert-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BatteryAlertTwoTone" :default BatteryAlertTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-alert-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryAlertTwoTone)))