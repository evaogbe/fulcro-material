(ns ogbe.fulcro.mui.icons.mail-lock-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MailLockSharp" :default MailLockSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mail-lock-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MailLockSharp)))