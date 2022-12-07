(ns ogbe.fulcro.mui.icons.account-balance-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AccountBalanceRounded" :default AccountBalanceRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-balance-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountBalanceRounded)))