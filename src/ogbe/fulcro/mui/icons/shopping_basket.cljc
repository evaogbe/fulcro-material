(ns ogbe.fulcro.mui.icons.shopping-basket
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingBasket" :default ShoppingBasket]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-basket
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingBasket)))