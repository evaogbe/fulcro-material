(ns ogbe.fulcro.mui.icons.account-tree
  #?(:cljs (:require
            ["@mui/icons-material/AccountTree" :default AccountTree]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-tree
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountTree)))