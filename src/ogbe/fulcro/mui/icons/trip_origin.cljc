(ns ogbe.fulcro.mui.icons.trip-origin
  #?(:cljs (:require
            ["@mui/icons-material/TripOrigin" :default TripOrigin]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-trip-origin
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TripOrigin)))