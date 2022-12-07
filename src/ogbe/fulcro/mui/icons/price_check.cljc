(ns ogbe.fulcro.mui.icons.price-check
  #?(:cljs (:require
            ["@mui/icons-material/PriceCheck" :default PriceCheck]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-price-check
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PriceCheck)))