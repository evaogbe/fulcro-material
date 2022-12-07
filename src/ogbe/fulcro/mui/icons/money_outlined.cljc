(ns ogbe.fulcro.mui.icons.money-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MoneyOutlined" :default MoneyOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-money-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoneyOutlined)))