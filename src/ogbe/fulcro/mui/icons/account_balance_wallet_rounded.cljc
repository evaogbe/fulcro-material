(ns ogbe.fulcro.mui.icons.account-balance-wallet-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AccountBalanceWalletRounded" :default AccountBalanceWalletRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-balance-wallet-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountBalanceWalletRounded)))