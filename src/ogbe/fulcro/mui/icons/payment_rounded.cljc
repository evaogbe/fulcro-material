(ns ogbe.fulcro.mui.icons.payment-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PaymentRounded" :default PaymentRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-payment-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaymentRounded)))