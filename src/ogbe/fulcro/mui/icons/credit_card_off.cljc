(ns ogbe.fulcro.mui.icons.credit-card-off
  #?(:cljs (:require
            ["@mui/icons-material/CreditCardOff" :default CreditCardOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-credit-card-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreditCardOff)))