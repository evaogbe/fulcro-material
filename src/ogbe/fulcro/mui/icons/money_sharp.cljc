(ns ogbe.fulcro.mui.icons.money-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MoneySharp" :default MoneySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-money-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoneySharp)))