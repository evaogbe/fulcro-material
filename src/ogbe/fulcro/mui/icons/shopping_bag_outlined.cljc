(ns ogbe.fulcro.mui.icons.shopping-bag-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ShoppingBagOutlined" :default ShoppingBagOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shopping-bag-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShoppingBagOutlined)))