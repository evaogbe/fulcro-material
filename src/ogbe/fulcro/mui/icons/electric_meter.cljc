(ns ogbe.fulcro.mui.icons.electric-meter
  #?(:cljs (:require
            ["@mui/icons-material/ElectricMeter" :default ElectricMeter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-electric-meter
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ElectricMeter)))