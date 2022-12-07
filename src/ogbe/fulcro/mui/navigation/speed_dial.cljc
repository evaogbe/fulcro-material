(ns ogbe.fulcro.mui.navigation.speed-dial
  #?(:cljs (:require
            ["@mui/material/SpeedDial" :default SpeedDial]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-speed-dial #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory SpeedDial)))
