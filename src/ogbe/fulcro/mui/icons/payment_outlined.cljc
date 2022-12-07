(ns ogbe.fulcro.mui.icons.payment-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PaymentOutlined" :default PaymentOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-payment-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaymentOutlined)))