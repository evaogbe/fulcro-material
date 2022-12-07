(ns ogbe.fulcro.mui.icons.currency-bitcoin
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyBitcoin" :default CurrencyBitcoin]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-bitcoin
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyBitcoin)))