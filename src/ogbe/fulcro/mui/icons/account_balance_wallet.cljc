(ns ogbe.fulcro.mui.icons.account-balance-wallet
  #?(:cljs (:require
            ["@mui/icons-material/AccountBalanceWallet" :default AccountBalanceWallet]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-balance-wallet
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountBalanceWallet)))