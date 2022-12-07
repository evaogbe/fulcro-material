(ns ogbe.fulcro.mui.icons.credit-card-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CreditCardRounded" :default CreditCardRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-credit-card-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreditCardRounded)))