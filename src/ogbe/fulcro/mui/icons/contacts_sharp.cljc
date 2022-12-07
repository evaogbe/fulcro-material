(ns ogbe.fulcro.mui.icons.contacts-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ContactsSharp" :default ContactsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contacts-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactsSharp)))