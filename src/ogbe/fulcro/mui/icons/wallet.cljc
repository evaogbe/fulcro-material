(ns ogbe.fulcro.mui.icons.wallet
  #?(:cljs (:require
            ["@mui/icons-material/Wallet" :default Wallet]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wallet
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Wallet)))