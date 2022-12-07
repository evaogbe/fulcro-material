(ns ogbe.fulcro.mui.icons.price-change-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PriceChangeRounded" :default PriceChangeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-price-change-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PriceChangeRounded)))