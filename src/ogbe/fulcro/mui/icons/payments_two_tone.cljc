(ns ogbe.fulcro.mui.icons.payments-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PaymentsTwoTone" :default PaymentsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-payments-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaymentsTwoTone)))