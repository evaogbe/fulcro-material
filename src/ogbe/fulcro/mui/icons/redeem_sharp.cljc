(ns ogbe.fulcro.mui.icons.redeem-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RedeemSharp" :default RedeemSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-redeem-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RedeemSharp)))