(ns ogbe.fulcro.mui.icons.wallet-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WalletSharp" :default WalletSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wallet-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WalletSharp)))