(ns ogbe.fulcro.mui.icons.assignment-return
  #?(:cljs (:require
            ["@mui/icons-material/AssignmentReturn" :default AssignmentReturn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assignment-return
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssignmentReturn)))