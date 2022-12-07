(ns ogbe.fulcro.mui.icons.approval-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ApprovalOutlined" :default ApprovalOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-approval-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ApprovalOutlined)))