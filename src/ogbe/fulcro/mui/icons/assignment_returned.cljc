(ns ogbe.fulcro.mui.icons.assignment-returned
  #?(:cljs (:require
            ["@mui/icons-material/AssignmentReturned" :default AssignmentReturned]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assignment-returned
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssignmentReturned)))