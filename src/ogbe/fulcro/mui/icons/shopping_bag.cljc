(ns ogbe.fulcro.mui.icons.shopping-bag
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingBag" :default ShoppingBag]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-bag
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingBag)))