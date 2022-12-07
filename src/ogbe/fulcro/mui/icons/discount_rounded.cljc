(ns ogbe.fulcro.mui.icons.discount-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DiscountRounded" :default DiscountRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-discount-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DiscountRounded)))