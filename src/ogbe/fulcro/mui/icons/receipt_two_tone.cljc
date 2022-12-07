(ns ogbe.fulcro.mui.icons.receipt-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ReceiptTwoTone" :default ReceiptTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-receipt-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReceiptTwoTone)))