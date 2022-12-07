(ns ogbe.fulcro.mui.icons.login-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/LoginTwoTone" :default LoginTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-login-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LoginTwoTone)))