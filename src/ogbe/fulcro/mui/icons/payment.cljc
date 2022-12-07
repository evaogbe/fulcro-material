(ns ogbe.fulcro.mui.icons.payment
  #?(:cljs (:require
            ["@mui/icons-material/Payment" :default Payment]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-payment
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Payment)))