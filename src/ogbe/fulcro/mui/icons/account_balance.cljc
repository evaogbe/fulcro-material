(ns ogbe.fulcro.mui.icons.account-balance
  #?(:cljs (:require
            ["@mui/icons-material/AccountBalance" :default AccountBalance]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-balance
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountBalance)))