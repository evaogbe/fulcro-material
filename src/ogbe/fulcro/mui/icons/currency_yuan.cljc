(ns ogbe.fulcro.mui.icons.currency-yuan
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyYuan" :default CurrencyYuan]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-yuan
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyYuan)))