(ns ogbe.fulcro.mui.icons.approval-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ApprovalTwoTone" :default ApprovalTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-approval-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ApprovalTwoTone)))