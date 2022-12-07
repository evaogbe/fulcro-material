(ns ogbe.fulcro.mui.icons.heat-pump
  #?(:cljs (:require
            ["@mui/icons-material/HeatPump" :default HeatPump]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-heat-pump
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HeatPump)))