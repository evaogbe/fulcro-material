(ns ogbe.fulcro.mui.icons.battery-full-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BatteryFullRounded" :default BatteryFullRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-full-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryFullRounded)))