(ns ogbe.fulcro.mui.icons.inbox-rounded
  #?(:cljs (:require
            ["@mui/icons-material/InboxRounded" :default InboxRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-inbox-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InboxRounded)))