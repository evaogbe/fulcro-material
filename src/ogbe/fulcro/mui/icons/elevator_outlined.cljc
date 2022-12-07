(ns ogbe.fulcro.mui.icons.elevator-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ElevatorOutlined" :default ElevatorOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-elevator-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ElevatorOutlined)))