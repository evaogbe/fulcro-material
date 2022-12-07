(ns ogbe.fulcro.mui.icons.location-city
  #?(:cljs (:require
            ["@mui/icons-material/LocationCity" :default LocationCity]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-location-city
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocationCity)))