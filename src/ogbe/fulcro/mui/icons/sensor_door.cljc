(ns ogbe.fulcro.mui.icons.sensor-door
  #?(:cljs (:require
            ["@mui/icons-material/SensorDoor" :default SensorDoor]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensor-door
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorDoor)))