(ns ogbe.fulcro.mui.icons.flight-takeoff
  #?(:cljs (:require
            ["@mui/icons-material/FlightTakeoff" :default FlightTakeoff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flight-takeoff
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlightTakeoff)))