(ns ogbe.fulcro.mui.icons.directions-walk
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsWalk" :default DirectionsWalk]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-walk
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsWalk)))