(ns ogbe.fulcro.mui.icons.sensor-occupied-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SensorOccupiedRounded" :default SensorOccupiedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensor-occupied-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorOccupiedRounded)))