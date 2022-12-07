(ns ogbe.fulcro.mui.icons.shopping-cart-checkout
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingCartCheckout" :default ShoppingCartCheckout]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-cart-checkout
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingCartCheckout)))