(ns ogbe.fulcro.mui.icons.add-shopping-cart
  #?(:cljs (:require
            ["@mui/icons-material/AddShoppingCart" :default AddShoppingCart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-shopping-cart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddShoppingCart)))