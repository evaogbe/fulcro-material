(ns ogbe.fulcro.mui.icons.price-change-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PriceChangeSharp" :default PriceChangeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-price-change-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PriceChangeSharp)))