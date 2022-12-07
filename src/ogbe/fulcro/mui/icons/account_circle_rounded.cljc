(ns ogbe.fulcro.mui.icons.account-circle-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AccountCircleRounded" :default AccountCircleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-circle-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountCircleRounded)))