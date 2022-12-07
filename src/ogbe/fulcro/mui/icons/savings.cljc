(ns ogbe.fulcro.mui.icons.savings
  #?(:cljs (:require
            ["@mui/icons-material/Savings" :default Savings]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-savings
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Savings)))