(ns ogbe.fulcro.mui.icons.assignment-late
  #?(:cljs (:require
            ["@mui/icons-material/AssignmentLate" :default AssignmentLate]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assignment-late
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssignmentLate)))