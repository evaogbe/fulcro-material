(ns ogbe.fulcro.mui.icons.chat-bubble-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ChatBubbleRounded" :default ChatBubbleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chat-bubble-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChatBubbleRounded)))