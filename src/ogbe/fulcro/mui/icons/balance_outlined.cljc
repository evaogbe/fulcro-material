(ns ogbe.fulcro.mui.icons.balance-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BalanceOutlined" :default BalanceOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-balance-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BalanceOutlined)))