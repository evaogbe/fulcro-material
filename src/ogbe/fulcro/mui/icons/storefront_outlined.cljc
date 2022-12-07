(ns ogbe.fulcro.mui.icons.storefront-outlined
  #?(:cljs (:require
            ["@mui/icons-material/StorefrontOutlined" :default StorefrontOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storefront-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StorefrontOutlined)))