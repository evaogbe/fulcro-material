(ns ogbe.fulcro.mui.icons.battery-alert-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BatteryAlertRounded" :default BatteryAlertRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-alert-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryAlertRounded)))