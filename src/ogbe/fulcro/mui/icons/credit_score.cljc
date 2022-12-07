(ns ogbe.fulcro.mui.icons.credit-score
  #?(:cljs (:require
            ["@mui/icons-material/CreditScore" :default CreditScore]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-credit-score
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreditScore)))