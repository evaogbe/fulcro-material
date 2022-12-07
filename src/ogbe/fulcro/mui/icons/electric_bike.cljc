(ns ogbe.fulcro.mui.icons.electric-bike
  #?(:cljs (:require
            ["@mui/icons-material/ElectricBike" :default ElectricBike]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-electric-bike
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ElectricBike)))