(ns ogbe.fulcro.mui.icons.production-quantity-limits
  #?(:cljs (:require
            ["@mui/icons-material/ProductionQuantityLimits" :default ProductionQuantityLimits]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-production-quantity-limits
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ProductionQuantityLimits)))