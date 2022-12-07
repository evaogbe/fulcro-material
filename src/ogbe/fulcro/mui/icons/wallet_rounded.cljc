(ns ogbe.fulcro.mui.icons.wallet-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WalletRounded" :default WalletRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wallet-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WalletRounded)))