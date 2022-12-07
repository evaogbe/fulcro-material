(ns ogbe.fulcro.mui.icons.mail-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MailRounded" :default MailRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mail-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MailRounded)))