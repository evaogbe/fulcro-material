(ns ogbe.fulcro.mui.icons.directions-boat
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsBoat" :default DirectionsBoat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-boat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsBoat)))