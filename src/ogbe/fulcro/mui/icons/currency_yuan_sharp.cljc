(ns ogbe.fulcro.mui.icons.currency-yuan-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyYuanSharp" :default CurrencyYuanSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-yuan-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyYuanSharp)))