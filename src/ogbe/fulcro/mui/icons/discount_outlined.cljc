(ns ogbe.fulcro.mui.icons.discount-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DiscountOutlined" :default DiscountOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-discount-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DiscountOutlined)))