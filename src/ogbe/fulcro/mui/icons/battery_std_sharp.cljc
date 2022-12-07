(ns ogbe.fulcro.mui.icons.battery-std-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BatteryStdSharp" :default BatteryStdSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-std-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryStdSharp)))