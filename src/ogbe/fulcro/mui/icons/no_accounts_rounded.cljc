(ns ogbe.fulcro.mui.icons.no-accounts-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NoAccountsRounded" :default NoAccountsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-accounts-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoAccountsRounded)))