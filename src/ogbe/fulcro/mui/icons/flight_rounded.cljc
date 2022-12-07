(ns ogbe.fulcro.mui.icons.flight-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FlightRounded" :default FlightRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flight-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlightRounded)))