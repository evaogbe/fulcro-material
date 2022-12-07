(ns ogbe.fulcro.mui.icons.sensor-occupied-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SensorOccupiedSharp" :default SensorOccupiedSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensor-occupied-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorOccupiedSharp)))