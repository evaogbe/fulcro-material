(ns ogbe.fulcro.mui.icons.thermostat-auto
  #?(:cljs (:require
            ["@mui/icons-material/ThermostatAuto" :default ThermostatAuto]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thermostat-auto
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThermostatAuto)))