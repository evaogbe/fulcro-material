(ns ogbe.fulcro.mui.icons.discount-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DiscountSharp" :default DiscountSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-discount-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DiscountSharp)))