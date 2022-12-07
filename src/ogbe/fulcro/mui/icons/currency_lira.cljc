(ns ogbe.fulcro.mui.icons.currency-lira
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyLira" :default CurrencyLira]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-lira
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyLira)))