(ns ogbe.fulcro.mui.icons.redeem-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/RedeemTwoTone" :default RedeemTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-redeem-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RedeemTwoTone)))