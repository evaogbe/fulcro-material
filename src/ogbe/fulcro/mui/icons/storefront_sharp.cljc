(ns ogbe.fulcro.mui.icons.storefront-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StorefrontSharp" :default StorefrontSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storefront-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StorefrontSharp)))