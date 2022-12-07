(ns ogbe.fulcro.mui.icons.mark-email-unread
  #?(:cljs (:require
            ["@mui/icons-material/MarkEmailUnread" :default MarkEmailUnread]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mark-email-unread
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MarkEmailUnread)))