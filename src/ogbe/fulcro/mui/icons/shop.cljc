(ns ogbe.fulcro.mui.icons.shop
  #?(:cljs (:require
            ["@mui/icons-material/Shop" :default Shop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shop
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Shop)))