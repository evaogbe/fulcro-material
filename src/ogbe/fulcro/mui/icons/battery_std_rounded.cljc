(ns ogbe.fulcro.mui.icons.battery-std-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BatteryStdRounded" :default BatteryStdRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-std-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryStdRounded)))