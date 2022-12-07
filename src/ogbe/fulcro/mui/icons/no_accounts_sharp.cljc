(ns ogbe.fulcro.mui.icons.no-accounts-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NoAccountsSharp" :default NoAccountsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-accounts-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoAccountsSharp)))