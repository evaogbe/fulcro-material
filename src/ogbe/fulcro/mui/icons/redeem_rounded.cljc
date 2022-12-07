(ns ogbe.fulcro.mui.icons.redeem-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RedeemRounded" :default RedeemRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-redeem-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RedeemRounded)))