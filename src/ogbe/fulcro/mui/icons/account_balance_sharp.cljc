(ns ogbe.fulcro.mui.icons.account-balance-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AccountBalanceSharp" :default AccountBalanceSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-balance-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountBalanceSharp)))