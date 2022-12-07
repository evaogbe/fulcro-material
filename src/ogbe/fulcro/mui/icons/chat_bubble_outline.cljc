(ns ogbe.fulcro.mui.icons.chat-bubble-outline
  #?(:cljs (:require
            ["@mui/icons-material/ChatBubbleOutline" :default ChatBubbleOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chat-bubble-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChatBubbleOutline)))