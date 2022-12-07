(ns ogbe.fulcro.mui.icons.balance-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BalanceSharp" :default BalanceSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-balance-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BalanceSharp)))