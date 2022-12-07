(ns ogbe.fulcro.mui.icons.reduce-capacity
  #?(:cljs (:require
            ["@mui/icons-material/ReduceCapacity" :default ReduceCapacity]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reduce-capacity
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReduceCapacity)))