(ns ogbe.fulcro.mui.icons.login-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LoginSharp" :default LoginSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-login-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LoginSharp)))