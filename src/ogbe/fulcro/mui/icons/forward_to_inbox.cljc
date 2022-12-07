(ns ogbe.fulcro.mui.icons.forward-to-inbox
  #?(:cljs (:require
            ["@mui/icons-material/ForwardToInbox" :default ForwardToInbox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-forward-to-inbox
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ForwardToInbox)))