(ns ogbe.fulcro.mui.icons.electric-scooter
  #?(:cljs (:require
            ["@mui/icons-material/ElectricScooter" :default ElectricScooter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-electric-scooter
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ElectricScooter)))