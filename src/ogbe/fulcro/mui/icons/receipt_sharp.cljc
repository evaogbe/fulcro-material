(ns ogbe.fulcro.mui.icons.receipt-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ReceiptSharp" :default ReceiptSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-receipt-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReceiptSharp)))