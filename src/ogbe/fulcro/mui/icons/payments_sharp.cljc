(ns ogbe.fulcro.mui.icons.payments-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PaymentsSharp" :default PaymentsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-payments-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaymentsSharp)))