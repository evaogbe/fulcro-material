(ns ogbe.fulcro.mui.icons.flight-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FlightSharp" :default FlightSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flight-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlightSharp)))