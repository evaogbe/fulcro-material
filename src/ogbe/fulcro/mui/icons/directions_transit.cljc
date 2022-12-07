(ns ogbe.fulcro.mui.icons.directions-transit
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsTransit" :default DirectionsTransit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-transit
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsTransit)))