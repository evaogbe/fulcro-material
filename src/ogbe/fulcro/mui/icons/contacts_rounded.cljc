(ns ogbe.fulcro.mui.icons.contacts-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ContactsRounded" :default ContactsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contacts-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactsRounded)))