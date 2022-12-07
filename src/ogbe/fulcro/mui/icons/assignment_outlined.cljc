(ns ogbe.fulcro.mui.icons.assignment-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AssignmentOutlined" :default AssignmentOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assignment-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssignmentOutlined)))