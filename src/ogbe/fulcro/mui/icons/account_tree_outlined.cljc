(ns ogbe.fulcro.mui.icons.account-tree-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AccountTreeOutlined" :default AccountTreeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-tree-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountTreeOutlined)))