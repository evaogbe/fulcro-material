(ns ogbe.fulcro.mui.icons.battery-full-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BatteryFullOutlined" :default BatteryFullOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-full-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryFullOutlined)))