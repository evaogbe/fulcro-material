(ns ogbe.fulcro.mui.navigation.speed-dial-action
  #?(:cljs (:require
            ["@mui/material/SpeedDialAction" :default SpeedDialAction]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-speed-dial-action #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory SpeedDialAction)))
