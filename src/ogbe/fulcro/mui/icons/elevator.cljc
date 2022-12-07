(ns ogbe.fulcro.mui.icons.elevator
  #?(:cljs (:require
            ["@mui/icons-material/Elevator" :default Elevator]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-elevator
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Elevator)))