(ns ogbe.fulcro.mui.icons.currency-exchange
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyExchange" :default CurrencyExchange]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-exchange
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyExchange)))