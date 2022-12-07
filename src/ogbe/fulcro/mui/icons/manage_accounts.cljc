(ns ogbe.fulcro.mui.icons.manage-accounts
  #?(:cljs (:require
            ["@mui/icons-material/ManageAccounts" :default ManageAccounts]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-manage-accounts
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ManageAccounts)))