(ns ogbe.fulcro.mui.icons.account-box-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AccountBoxRounded" :default AccountBoxRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-box-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountBoxRounded)))