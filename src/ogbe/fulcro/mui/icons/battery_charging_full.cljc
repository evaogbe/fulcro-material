(ns ogbe.fulcro.mui.icons.battery-charging-full
  #?(:cljs (:require
            ["@mui/icons-material/BatteryChargingFull" :default BatteryChargingFull]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-charging-full
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryChargingFull)))