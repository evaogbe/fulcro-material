(ns ogbe.fulcro.mui.icons.shopping-basket-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingBasketSharp" :default ShoppingBasketSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-basket-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingBasketSharp)))