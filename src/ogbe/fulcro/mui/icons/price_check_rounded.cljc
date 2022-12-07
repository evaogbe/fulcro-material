(ns ogbe.fulcro.mui.icons.price-check-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PriceCheckRounded" :default PriceCheckRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-price-check-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PriceCheckRounded)))