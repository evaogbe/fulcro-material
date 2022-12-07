(ns ogbe.fulcro.mui.icons.contact-mail
  #?(:cljs (:require
            ["@mui/icons-material/ContactMail" :default ContactMail]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contact-mail
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactMail)))