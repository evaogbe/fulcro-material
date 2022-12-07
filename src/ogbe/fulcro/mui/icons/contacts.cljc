(ns ogbe.fulcro.mui.icons.contacts
  #?(:cljs (:require
            ["@mui/icons-material/Contacts" :default Contacts]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contacts
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Contacts)))