(ns ogbe.fulcro.mui.icons.location-on-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LocationOnSharp" :default LocationOnSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-location-on-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocationOnSharp)))