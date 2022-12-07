(ns ogbe.fulcro.mui.icons.gps-off
  #?(:cljs (:require
            ["@mui/icons-material/GpsOff" :default GpsOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gps-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GpsOff)))