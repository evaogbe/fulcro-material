(ns ogbe.fulcro.mui.icons.payments-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PaymentsRounded" :default PaymentsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-payments-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaymentsRounded)))