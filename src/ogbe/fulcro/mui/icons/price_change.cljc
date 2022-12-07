(ns ogbe.fulcro.mui.icons.price-change
  #?(:cljs (:require
            ["@mui/icons-material/PriceChange" :default PriceChange]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-price-change
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PriceChange)))