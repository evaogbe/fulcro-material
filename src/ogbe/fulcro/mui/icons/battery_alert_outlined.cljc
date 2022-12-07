(ns ogbe.fulcro.mui.icons.battery-alert-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BatteryAlertOutlined" :default BatteryAlertOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-alert-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryAlertOutlined)))