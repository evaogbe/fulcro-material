(ns ogbe.fulcro.mui.icons.shopping-cart-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingCartRounded" :default ShoppingCartRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-cart-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingCartRounded)))