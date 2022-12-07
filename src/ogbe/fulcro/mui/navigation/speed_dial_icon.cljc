(ns ogbe.fulcro.mui.navigation.speed-dial-icon
  #?(:cljs (:require
            ["@mui/material/SpeedDialIcon" :default SpeedDialIcon]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-speed-dial-icon #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory SpeedDialIcon)))
