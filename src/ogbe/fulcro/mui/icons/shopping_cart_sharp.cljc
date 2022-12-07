(ns ogbe.fulcro.mui.icons.shopping-cart-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingCartSharp" :default ShoppingCartSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-cart-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingCartSharp)))