(ns ogbe.fulcro.mui.icons.airline-stops
  #?(:cljs (:require
            ["@mui/icons-material/AirlineStops" :default AirlineStops]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airline-stops
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirlineStops)))