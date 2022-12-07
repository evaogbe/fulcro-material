(ns ogbe.fulcro.mui.icons.mark-chat-unread
  #?(:cljs (:require
            ["@mui/icons-material/MarkChatUnread" :default MarkChatUnread]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mark-chat-unread
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MarkChatUnread)))