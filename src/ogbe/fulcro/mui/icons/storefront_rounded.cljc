(ns ogbe.fulcro.mui.icons.storefront-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StorefrontRounded" :default StorefrontRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storefront-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StorefrontRounded)))