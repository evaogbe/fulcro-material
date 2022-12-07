(ns ogbe.fulcro.mui.icons.money-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MoneyRounded" :default MoneyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-money-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoneyRounded)))