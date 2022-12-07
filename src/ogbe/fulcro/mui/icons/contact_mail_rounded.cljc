(ns ogbe.fulcro.mui.icons.contact-mail-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ContactMailRounded" :default ContactMailRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contact-mail-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactMailRounded)))