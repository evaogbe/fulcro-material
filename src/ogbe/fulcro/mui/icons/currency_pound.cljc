(ns ogbe.fulcro.mui.icons.currency-pound
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyPound" :default CurrencyPound]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-pound
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyPound)))