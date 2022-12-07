(ns ogbe.fulcro.mui.icons.sensors
  #?(:cljs (:require
            ["@mui/icons-material/Sensors" :default Sensors]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensors
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sensors)))