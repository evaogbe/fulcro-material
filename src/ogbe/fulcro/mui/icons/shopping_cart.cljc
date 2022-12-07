(ns ogbe.fulcro.mui.icons.shopping-cart
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingCart" :default ShoppingCart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-cart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingCart)))