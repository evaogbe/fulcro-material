(ns ogbe.fulcro.mui.icons.mail-lock-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MailLockOutlined" :default MailLockOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mail-lock-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MailLockOutlined)))