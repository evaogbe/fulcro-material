(ns ogbe.fulcro.mui.icons.airport-shuttle
  #?(:cljs (:require
            ["@mui/icons-material/AirportShuttle" :default AirportShuttle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airport-shuttle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirportShuttle)))