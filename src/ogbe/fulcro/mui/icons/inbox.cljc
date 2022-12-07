(ns ogbe.fulcro.mui.icons.inbox
  #?(:cljs (:require
            ["@mui/icons-material/Inbox" :default Inbox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-inbox
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Inbox)))