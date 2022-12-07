(ns ogbe.fulcro.mui.icons.battery-full
  #?(:cljs (:require
            ["@mui/icons-material/BatteryFull" :default BatteryFull]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-full
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryFull)))