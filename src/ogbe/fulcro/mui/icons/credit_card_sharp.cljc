(ns ogbe.fulcro.mui.icons.credit-card-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CreditCardSharp" :default CreditCardSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-credit-card-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreditCardSharp)))