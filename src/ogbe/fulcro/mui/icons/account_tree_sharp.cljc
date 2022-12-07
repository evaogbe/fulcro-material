(ns ogbe.fulcro.mui.icons.account-tree-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AccountTreeSharp" :default AccountTreeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-tree-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountTreeSharp)))