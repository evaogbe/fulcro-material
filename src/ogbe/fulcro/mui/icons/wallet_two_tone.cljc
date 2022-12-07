(ns ogbe.fulcro.mui.icons.wallet-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WalletTwoTone" :default WalletTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wallet-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WalletTwoTone)))