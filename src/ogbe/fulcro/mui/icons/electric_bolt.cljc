(ns ogbe.fulcro.mui.icons.electric-bolt
  #?(:cljs (:require
            ["@mui/icons-material/ElectricBolt" :default ElectricBolt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-electric-bolt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ElectricBolt)))