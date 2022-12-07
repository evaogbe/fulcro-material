(ns ogbe.fulcro.mui.icons.location-on
  #?(:cljs (:require
            ["@mui/icons-material/LocationOn" :default LocationOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-location-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocationOn)))