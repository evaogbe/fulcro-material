(ns ogbe.fulcro.mui.icons.contactless-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ContactlessSharp" :default ContactlessSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contactless-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContactlessSharp)))