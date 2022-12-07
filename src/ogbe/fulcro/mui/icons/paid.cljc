(ns ogbe.fulcro.mui.icons.paid
  #?(:cljs (:require
            ["@mui/icons-material/Paid" :default Paid]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-paid
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Paid)))