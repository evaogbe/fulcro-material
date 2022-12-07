(ns ogbe.fulcro.mui.icons.elevator-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ElevatorSharp" :default ElevatorSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-elevator-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ElevatorSharp)))