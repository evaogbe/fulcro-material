(ns ogbe.fulcro.mui.icons.account-box
  #?(:cljs (:require
            ["@mui/icons-material/AccountBox" :default AccountBox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-box
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountBox)))