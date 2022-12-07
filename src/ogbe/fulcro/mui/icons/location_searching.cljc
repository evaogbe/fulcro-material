(ns ogbe.fulcro.mui.icons.location-searching
  #?(:cljs (:require
            ["@mui/icons-material/LocationSearching" :default LocationSearching]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-location-searching
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocationSearching)))