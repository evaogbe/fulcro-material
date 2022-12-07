(ns ogbe.fulcro.mui.icons.elevator-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ElevatorRounded" :default ElevatorRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-elevator-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ElevatorRounded)))