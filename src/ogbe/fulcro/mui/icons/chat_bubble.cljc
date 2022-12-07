(ns ogbe.fulcro.mui.icons.chat-bubble
  #?(:cljs (:require
            ["@mui/icons-material/ChatBubble" :default ChatBubble]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chat-bubble
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChatBubble)))