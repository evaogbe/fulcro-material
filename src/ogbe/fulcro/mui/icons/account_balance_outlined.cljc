(ns ogbe.fulcro.mui.icons.account-balance-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AccountBalanceOutlined" :default AccountBalanceOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-balance-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountBalanceOutlined)))