(ns ogbe.fulcro.mui.icons.flight-land
  #?(:cljs (:require
            ["@mui/icons-material/FlightLand" :default FlightLand]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flight-land
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlightLand)))