(ns ogbe.fulcro.mui.icons.contacts-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ContactsOutlined" :default ContactsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contacts-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactsOutlined)))