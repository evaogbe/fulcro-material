(ns ogbe.fulcro.mui.icons.shop-two
  #?(:cljs (:require
            ["@mui/icons-material/ShopTwo" :default ShopTwo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shop-two
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShopTwo)))