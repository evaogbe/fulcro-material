(ns ogbe.fulcro.mui.icons.shopping-basket-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingBasketRounded" :default ShoppingBasketRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-basket-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingBasketRounded)))