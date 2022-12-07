(ns ogbe.fulcro.mui.icons.directions-off
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsOff" :default DirectionsOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsOff)))