(ns ogbe.fulcro.mui.icons.password-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PasswordSharp" :default PasswordSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-password-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PasswordSharp)))