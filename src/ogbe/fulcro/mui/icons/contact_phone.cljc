(ns ogbe.fulcro.mui.icons.contact-phone
  #?(:cljs (:require
            ["@mui/icons-material/ContactPhone" :default ContactPhone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contact-phone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactPhone)))