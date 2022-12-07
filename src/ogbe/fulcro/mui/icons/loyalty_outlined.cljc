(ns ogbe.fulcro.mui.icons.loyalty-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LoyaltyOutlined" :default LoyaltyOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-loyalty-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LoyaltyOutlined)))