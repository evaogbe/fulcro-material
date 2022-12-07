(ns ogbe.fulcro.mui.icons.contact-emergency
  #?(:cljs (:require
            ["@mui/icons-material/ContactEmergency" :default ContactEmergency]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contact-emergency
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactEmergency)))