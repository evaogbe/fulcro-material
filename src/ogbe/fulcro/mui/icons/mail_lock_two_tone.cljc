(ns ogbe.fulcro.mui.icons.mail-lock-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MailLockTwoTone" :default MailLockTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mail-lock-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MailLockTwoTone)))