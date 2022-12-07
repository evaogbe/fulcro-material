(ns ogbe.fulcro.mui.icons.shopping-basket-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingBasketOutlined" :default ShoppingBasketOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-basket-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingBasketOutlined)))