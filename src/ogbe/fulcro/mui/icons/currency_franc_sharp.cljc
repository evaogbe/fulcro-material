(ns ogbe.fulcro.mui.icons.currency-franc-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CurrencyFrancSharp" :default CurrencyFrancSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-currency-franc-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurrencyFrancSharp)))