(ns ogbe.fulcro.mui.icons.storefront-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/StorefrontTwoTone" :default StorefrontTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storefront-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StorefrontTwoTone)))