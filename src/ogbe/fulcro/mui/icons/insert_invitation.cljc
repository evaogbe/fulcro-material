(ns ogbe.fulcro.mui.icons.insert-invitation
  #?(:cljs (:require
            ["@mui/icons-material/InsertInvitation" :default InsertInvitation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-insert-invitation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InsertInvitation)))