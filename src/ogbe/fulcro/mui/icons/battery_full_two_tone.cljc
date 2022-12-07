(ns ogbe.fulcro.mui.icons.battery-full-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BatteryFullTwoTone" :default BatteryFullTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-full-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryFullTwoTone)))