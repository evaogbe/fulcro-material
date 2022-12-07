(ns ogbe.fulcro.mui.icons.sensor-window-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SensorWindowSharp" :default SensorWindowSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensor-window-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorWindowSharp)))