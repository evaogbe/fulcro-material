(ns ogbe.fulcro.mui.icons.directions-railway
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsRailway" :default DirectionsRailway]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-railway
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsRailway)))