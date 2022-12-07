(ns ogbe.fulcro.mui.icons.no-accounts-outlined
  #?(:cljs (:require
            ["@mui/icons-material/NoAccountsOutlined" :default NoAccountsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-accounts-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoAccountsOutlined)))