(ns ogbe.fulcro.mui.icons.money-off
  #?(:cljs (:require
            ["@mui/icons-material/MoneyOff" :default MoneyOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-money-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoneyOff)))