(ns ogbe.fulcro.mui.icons.receipt
  #?(:cljs (:require
            ["@mui/icons-material/Receipt" :default Receipt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-receipt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Receipt)))