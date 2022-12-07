(ns ogbe.fulcro.mui.icons.location-off
  #?(:cljs (:require
            ["@mui/icons-material/LocationOff" :default LocationOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-location-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocationOff)))