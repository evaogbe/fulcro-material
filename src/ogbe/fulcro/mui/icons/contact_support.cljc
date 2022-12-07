(ns ogbe.fulcro.mui.icons.contact-support
  #?(:cljs (:require
            ["@mui/icons-material/ContactSupport" :default ContactSupport]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contact-support
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactSupport)))