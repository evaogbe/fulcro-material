(ns ogbe.fulcro.mui.icons.account-circle-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AccountCircleOutlined" :default AccountCircleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-circle-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountCircleOutlined)))