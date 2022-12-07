(ns ogbe.fulcro.mui.icons.approval-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ApprovalSharp" :default ApprovalSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-approval-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ApprovalSharp)))