(ns ogbe.fulcro.mui.icons.balance-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BalanceRounded" :default BalanceRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-balance-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BalanceRounded)))