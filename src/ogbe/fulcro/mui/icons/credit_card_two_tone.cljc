(ns ogbe.fulcro.mui.icons.credit-card-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CreditCardTwoTone" :default CreditCardTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-credit-card-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreditCardTwoTone)))