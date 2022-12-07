(ns ogbe.fulcro.mui.icons.loyalty-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LoyaltyRounded" :default LoyaltyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-loyalty-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LoyaltyRounded)))