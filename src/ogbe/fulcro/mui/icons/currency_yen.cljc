(ns ogbe.fulcro.mui.icons.currency-yen
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyYen" :default CurrencyYen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-yen
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyYen)))