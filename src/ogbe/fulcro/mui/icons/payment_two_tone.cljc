(ns ogbe.fulcro.mui.icons.payment-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PaymentTwoTone" :default PaymentTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-payment-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaymentTwoTone)))