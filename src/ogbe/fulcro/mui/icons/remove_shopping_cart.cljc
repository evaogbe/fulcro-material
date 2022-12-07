(ns ogbe.fulcro.mui.icons.remove-shopping-cart
  #?(:cljs (:require
            ["@mui/icons-material/RemoveShoppingCart" :default RemoveShoppingCart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-shopping-cart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveShoppingCart)))