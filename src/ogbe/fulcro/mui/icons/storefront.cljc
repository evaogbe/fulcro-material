(ns ogbe.fulcro.mui.icons.storefront
  #?(:cljs (:require
            ["@mui/icons-material/Storefront" :default Storefront]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storefront
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Storefront)))