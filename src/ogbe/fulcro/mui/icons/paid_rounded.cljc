(ns ogbe.fulcro.mui.icons.paid-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PaidRounded" :default PaidRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-paid-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaidRounded)))