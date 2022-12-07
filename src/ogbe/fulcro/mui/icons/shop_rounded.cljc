(ns ogbe.fulcro.mui.icons.shop-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ShopRounded" :default ShopRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shop-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShopRounded)))