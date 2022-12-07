(ns ogbe.fulcro.mui.icons.car-crash
  #?(:cljs (:require
            ["@mui/icons-material/CarCrash" :default CarCrash]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-car-crash
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CarCrash)))