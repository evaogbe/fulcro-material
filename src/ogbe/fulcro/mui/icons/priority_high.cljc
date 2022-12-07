(ns ogbe.fulcro.mui.icons.priority-high
  #?(:cljs (:require
            ["@mui/icons-material/PriorityHigh" :default PriorityHigh]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-priority-high
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PriorityHigh)))