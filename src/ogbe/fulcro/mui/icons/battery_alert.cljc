(ns ogbe.fulcro.mui.icons.battery-alert
  #?(:cljs (:require
            ["@mui/icons-material/BatteryAlert" :default BatteryAlert]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-alert
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatteryAlert)))