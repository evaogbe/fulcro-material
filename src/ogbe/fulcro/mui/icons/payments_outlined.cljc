(ns ogbe.fulcro.mui.icons.payments-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PaymentsOutlined" :default PaymentsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-payments-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaymentsOutlined)))