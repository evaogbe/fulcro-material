(ns ogbe.fulcro.mui.icons.mail-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MailTwoTone" :default MailTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mail-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MailTwoTone)))