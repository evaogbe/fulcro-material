(ns ogbe.fulcro.mui.icons.battery-full-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BatteryFullSharp" :default BatteryFullSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-full-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryFullSharp)))