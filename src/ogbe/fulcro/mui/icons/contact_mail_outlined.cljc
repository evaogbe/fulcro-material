(ns ogbe.fulcro.mui.icons.contact-mail-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ContactMailOutlined" :default ContactMailOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contact-mail-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactMailOutlined)))