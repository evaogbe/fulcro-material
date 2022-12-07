(ns ogbe.fulcro.mui.icons.currency-franc
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyFranc" :default CurrencyFranc]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-franc
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyFranc)))