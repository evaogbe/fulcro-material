(ns ogbe.fulcro.mui.icons.account-tree-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AccountTreeRounded" :default AccountTreeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-tree-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountTreeRounded)))