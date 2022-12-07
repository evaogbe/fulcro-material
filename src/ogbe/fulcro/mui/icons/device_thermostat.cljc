(ns ogbe.fulcro.mui.icons.device-thermostat
  #?(:cljs (:require
            ["@mui/icons-material/DeviceThermostat" :default DeviceThermostat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-device-thermostat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeviceThermostat)))