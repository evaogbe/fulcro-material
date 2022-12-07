(ns ogbe.fulcro.mui.icons.receipt-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ReceiptRounded" :default ReceiptRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-receipt-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReceiptRounded)))