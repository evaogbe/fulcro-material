(ns ogbe.fulcro.mui.icons.shop-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShopSharp" :default ShopSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shop-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShopSharp)))