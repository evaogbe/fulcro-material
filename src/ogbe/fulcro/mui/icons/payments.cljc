(ns ogbe.fulcro.mui.icons.payments
  #?(:cljs (:require
            ["@mui/icons-material/Payments" :default Payments]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-payments
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Payments)))