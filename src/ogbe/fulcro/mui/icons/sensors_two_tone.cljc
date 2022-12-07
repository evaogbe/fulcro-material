(ns ogbe.fulcro.mui.icons.sensors-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SensorsTwoTone" :default SensorsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensors-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorsTwoTone)))