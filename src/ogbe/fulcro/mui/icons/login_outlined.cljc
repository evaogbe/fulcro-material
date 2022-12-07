(ns ogbe.fulcro.mui.icons.login-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LoginOutlined" :default LoginOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-login-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LoginOutlined)))