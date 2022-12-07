(ns ogbe.fulcro.mui.icons.currency-ruble
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyRuble" :default CurrencyRuble]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-ruble
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyRuble)))