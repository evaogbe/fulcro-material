(ns ogbe.fulcro.mui.icons.inbox-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/InboxTwoTone" :default InboxTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-inbox-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InboxTwoTone)))