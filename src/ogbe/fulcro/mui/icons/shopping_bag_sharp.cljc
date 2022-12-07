(ns ogbe.fulcro.mui.icons.shopping-bag-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingBagSharp" :default ShoppingBagSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-bag-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingBagSharp)))