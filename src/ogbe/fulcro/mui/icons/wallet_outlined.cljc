(ns ogbe.fulcro.mui.icons.wallet-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WalletOutlined" :default WalletOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wallet-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WalletOutlined)))