(ns ogbe.fulcro.mui.icons.battery-std-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BatteryStdTwoTone" :default BatteryStdTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-std-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryStdTwoTone)))