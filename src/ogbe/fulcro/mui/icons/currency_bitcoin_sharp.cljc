(ns ogbe.fulcro.mui.icons.currency-bitcoin-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyBitcoinSharp" :default CurrencyBitcoinSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-bitcoin-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyBitcoinSharp)))