(ns ogbe.fulcro.mui.icons.thermostat-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ThermostatRounded" :default ThermostatRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thermostat-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThermostatRounded)))