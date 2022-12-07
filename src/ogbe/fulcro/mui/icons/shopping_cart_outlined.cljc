(ns ogbe.fulcro.mui.icons.shopping-cart-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingCartOutlined" :default ShoppingCartOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-cart-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingCartOutlined)))