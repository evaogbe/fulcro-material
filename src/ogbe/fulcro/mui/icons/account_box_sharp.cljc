(ns ogbe.fulcro.mui.icons.account-box-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AccountBoxSharp" :default AccountBoxSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-box-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountBoxSharp)))