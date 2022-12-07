(ns ogbe.fulcro.mui.icons.car-repair
  #?(:cljs (:require
            ["@mui/icons-material/CarRepair" :default CarRepair]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-car-repair
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CarRepair)))