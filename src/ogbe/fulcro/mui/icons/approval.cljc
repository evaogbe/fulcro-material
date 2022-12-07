(ns ogbe.fulcro.mui.icons.approval
  #?(:cljs (:require
            ["@mui/icons-material/Approval" :default Approval]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-approval
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Approval)))