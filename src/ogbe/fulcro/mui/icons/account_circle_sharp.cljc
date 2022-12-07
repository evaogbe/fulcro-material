(ns ogbe.fulcro.mui.icons.account-circle-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AccountCircleSharp" :default AccountCircleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-circle-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountCircleSharp)))