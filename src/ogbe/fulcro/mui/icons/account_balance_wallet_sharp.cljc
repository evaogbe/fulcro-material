(ns ogbe.fulcro.mui.icons.account-balance-wallet-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AccountBalanceWalletSharp" :default AccountBalanceWalletSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-balance-wallet-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountBalanceWalletSharp)))