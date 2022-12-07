(ns ogbe.fulcro.mui.icons.login-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LoginRounded" :default LoginRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-login-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LoginRounded)))