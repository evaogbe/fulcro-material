(ns ogbe.fulcro.mui.icons.loyalty-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LoyaltySharp" :default LoyaltySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-loyalty-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LoyaltySharp)))