(ns ogbe.fulcro.mui.icons.directions-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsRounded" :default DirectionsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsRounded)))