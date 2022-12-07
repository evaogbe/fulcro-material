(ns ogbe.fulcro.mui.icons.contacts-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ContactsTwoTone" :default ContactsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contacts-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactsTwoTone)))