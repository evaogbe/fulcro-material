(ns ogbe.fulcro.mui.icons.shop-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ShopOutlined" :default ShopOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shop-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShopOutlined)))