(ns ogbe.fulcro.mui.icons.flight-class
  #?(:cljs (:require
            ["@mui/icons-material/FlightClass" :default FlightClass]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flight-class
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlightClass)))