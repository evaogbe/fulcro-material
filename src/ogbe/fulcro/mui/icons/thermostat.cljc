(ns ogbe.fulcro.mui.icons.thermostat
  #?(:cljs (:require
            ["@mui/icons-material/Thermostat" :default Thermostat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thermostat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Thermostat)))