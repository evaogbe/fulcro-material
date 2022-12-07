(ns ogbe.fulcro.mui.icons.sensor-window-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SensorWindowRounded" :default SensorWindowRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensor-window-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorWindowRounded)))