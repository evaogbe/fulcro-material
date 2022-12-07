(ns ogbe.fulcro.mui.icons.credit-card-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CreditCardOutlined" :default CreditCardOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-credit-card-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreditCardOutlined)))