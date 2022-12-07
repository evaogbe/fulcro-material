(ns ogbe.fulcro.mui.icons.sensors-off
  #?(:cljs (:require
            ["@mui/icons-material/SensorsOff" :default SensorsOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensors-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorsOff)))