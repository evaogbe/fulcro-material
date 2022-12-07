(ns ogbe.fulcro.mui.icons.location-on-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LocationOnRounded" :default LocationOnRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-location-on-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocationOnRounded)))