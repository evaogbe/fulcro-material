(ns ogbe.fulcro.mui.icons.battery-alert-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BatteryAlertSharp" :default BatteryAlertSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-alert-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryAlertSharp)))