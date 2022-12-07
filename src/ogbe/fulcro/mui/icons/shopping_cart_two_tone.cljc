(ns ogbe.fulcro.mui.icons.shopping-cart-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingCartTwoTone" :default ShoppingCartTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-cart-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingCartTwoTone)))