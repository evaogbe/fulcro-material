(ns ogbe.fulcro.mui.icons.no-accounts
  #?(:cljs (:require
            ["@mui/icons-material/NoAccounts" :default NoAccounts]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-accounts
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoAccounts)))