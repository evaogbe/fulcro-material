(ns ogbe.fulcro.mui.icons.assignment-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AssignmentRounded" :default AssignmentRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assignment-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssignmentRounded)))