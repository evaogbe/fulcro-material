(ns ogbe.fulcro.mui.icons.contact-page
  #?(:cljs (:require
            ["@mui/icons-material/ContactPage" :default ContactPage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contact-page
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactPage)))