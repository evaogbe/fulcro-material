(ns ogbe.fulcro.mui.icons.currency-bitcoin-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyBitcoinRounded" :default CurrencyBitcoinRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-bitcoin-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyBitcoinRounded)))