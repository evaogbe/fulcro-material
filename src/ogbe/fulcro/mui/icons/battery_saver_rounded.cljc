(ns ogbe.fulcro.mui.icons.battery-saver-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BatterySaverRounded" :default BatterySaverRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-saver-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatterySaverRounded)))