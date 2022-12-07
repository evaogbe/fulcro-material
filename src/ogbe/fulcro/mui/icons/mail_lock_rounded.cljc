(ns ogbe.fulcro.mui.icons.mail-lock-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MailLockRounded" :default MailLockRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mail-lock-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MailLockRounded)))