(ns ogbe.fulcro.mui.icons.directions-subway
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsSubway" :default DirectionsSubway]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-subway
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsSubway)))