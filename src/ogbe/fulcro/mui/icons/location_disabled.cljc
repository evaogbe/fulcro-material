(ns ogbe.fulcro.mui.icons.location-disabled
  #?(:cljs (:require
            ["@mui/icons-material/LocationDisabled" :default LocationDisabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-location-disabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocationDisabled)))