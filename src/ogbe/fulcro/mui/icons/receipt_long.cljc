(ns ogbe.fulcro.mui.icons.receipt-long
  #?(:cljs (:require
            ["@mui/icons-material/ReceiptLong" :default ReceiptLong]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-receipt-long
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReceiptLong)))