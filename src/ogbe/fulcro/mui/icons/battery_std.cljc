(ns ogbe.fulcro.mui.icons.battery-std
  #?(:cljs (:require
            ["@mui/icons-material/BatteryStd" :default BatteryStd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-std
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryStd)))