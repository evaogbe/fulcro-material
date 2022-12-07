(ns ogbe.fulcro.mui.icons.password-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PasswordTwoTone" :default PasswordTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-password-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PasswordTwoTone)))