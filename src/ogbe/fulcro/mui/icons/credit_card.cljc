(ns ogbe.fulcro.mui.icons.credit-card
  #?(:cljs (:require
            ["@mui/icons-material/CreditCard" :default CreditCard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-credit-card
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreditCard)))