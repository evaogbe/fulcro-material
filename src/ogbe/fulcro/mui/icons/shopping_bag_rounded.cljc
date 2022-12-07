(ns ogbe.fulcro.mui.icons.shopping-bag-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingBagRounded" :default ShoppingBagRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-bag-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingBagRounded)))