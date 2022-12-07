(ns ogbe.fulcro.mui.icons.mail-lock
  #?(:cljs (:require
            ["@mui/icons-material/MailLock" :default MailLock]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mail-lock
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MailLock)))