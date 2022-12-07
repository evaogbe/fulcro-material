(ns ogbe.fulcro.mui.icons.password-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PasswordRounded" :default PasswordRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-password-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PasswordRounded)))