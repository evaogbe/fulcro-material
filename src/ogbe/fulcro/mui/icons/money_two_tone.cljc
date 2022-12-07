(ns ogbe.fulcro.mui.icons.money-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MoneyTwoTone" :default MoneyTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-money-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoneyTwoTone)))