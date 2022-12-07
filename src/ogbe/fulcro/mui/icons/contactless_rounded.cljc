(ns ogbe.fulcro.mui.icons.contactless-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ContactlessRounded" :default ContactlessRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contactless-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactlessRounded)))