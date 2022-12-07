(ns ogbe.fulcro.mui.icons.contact-mail-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ContactMailSharp" :default ContactMailSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contact-mail-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactMailSharp)))