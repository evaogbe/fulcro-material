(ns ogbe.fulcro.mui.icons.battery-std-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BatteryStdOutlined" :default BatteryStdOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-std-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryStdOutlined)))