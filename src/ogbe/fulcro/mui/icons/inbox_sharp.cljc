(ns ogbe.fulcro.mui.icons.inbox-sharp
  #?(:cljs (:require
            ["@mui/icons-material/InboxSharp" :default InboxSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-inbox-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InboxSharp)))