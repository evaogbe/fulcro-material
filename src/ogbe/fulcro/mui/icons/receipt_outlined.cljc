(ns ogbe.fulcro.mui.icons.receipt-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ReceiptOutlined" :default ReceiptOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-receipt-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReceiptOutlined)))