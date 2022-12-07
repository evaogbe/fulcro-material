(ns ogbe.fulcro.mui.icons.contactless-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ContactlessTwoTone" :default ContactlessTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contactless-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactlessTwoTone)))