(ns ogbe.fulcro.mui.icons.electric-car
  #?(:cljs (:require
            ["@mui/icons-material/ElectricCar" :default ElectricCar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-electric-car
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ElectricCar)))