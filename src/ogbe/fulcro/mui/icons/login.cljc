(ns ogbe.fulcro.mui.icons.login
  #?(:cljs (:require
            ["@mui/icons-material/Login" :default Login]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-login
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Login)))