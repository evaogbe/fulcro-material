(ns ogbe.fulcro.mui.icons.approval-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ApprovalRounded" :default ApprovalRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-approval-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ApprovalRounded)))