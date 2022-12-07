(ns ogbe.fulcro.mui.icons.password-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PasswordOutlined" :default PasswordOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-password-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PasswordOutlined)))