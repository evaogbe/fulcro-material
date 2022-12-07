(ns ogbe.fulcro.mui.icons.payment-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PaymentSharp" :default PaymentSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-payment-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaymentSharp)))