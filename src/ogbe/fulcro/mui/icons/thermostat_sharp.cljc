(ns ogbe.fulcro.mui.icons.thermostat-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ThermostatSharp" :default ThermostatSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thermostat-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ThermostatSharp)))