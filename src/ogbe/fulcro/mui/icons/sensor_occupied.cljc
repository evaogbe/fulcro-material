(ns ogbe.fulcro.mui.icons.sensor-occupied
  #?(:cljs (:require
            ["@mui/icons-material/SensorOccupied" :default SensorOccupied]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensor-occupied
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorOccupied)))