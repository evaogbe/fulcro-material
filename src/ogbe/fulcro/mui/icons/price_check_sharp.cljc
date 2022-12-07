(ns ogbe.fulcro.mui.icons.price-check-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PriceCheckSharp" :default PriceCheckSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-price-check-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PriceCheckSharp)))