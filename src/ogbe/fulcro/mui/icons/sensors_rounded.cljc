(ns ogbe.fulcro.mui.icons.sensors-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SensorsRounded" :default SensorsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensors-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorsRounded)))