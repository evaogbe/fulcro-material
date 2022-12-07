(ns ogbe.fulcro.mui.icons.savings-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SavingsRounded" :default SavingsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-savings-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SavingsRounded)))