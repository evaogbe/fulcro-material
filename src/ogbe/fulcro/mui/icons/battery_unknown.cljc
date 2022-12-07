(ns ogbe.fulcro.mui.icons.battery-unknown
  #?(:cljs (:require
            ["@mui/icons-material/BatteryUnknown" :default BatteryUnknown]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-unknown
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryUnknown)))