(ns ogbe.fulcro.mui.icons.sensor-window
  #?(:cljs (:require
            ["@mui/icons-material/SensorWindow" :default SensorWindow]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensor-window
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorWindow)))