(ns ogbe.fulcro.mui.icons.car-rental
  #?(:cljs (:require
            ["@mui/icons-material/CarRental" :default CarRental]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-car-rental
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CarRental)))