(ns ogbe.fulcro.mui.icons.account-box-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AccountBoxOutlined" :default AccountBoxOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-account-box-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccountBoxOutlined)))