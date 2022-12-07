(ns ogbe.fulcro.mui.icons.account-circle
  #?(:cljs (:require
            ["@mui/icons-material/AccountCircle" :default AccountCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountCircle)))