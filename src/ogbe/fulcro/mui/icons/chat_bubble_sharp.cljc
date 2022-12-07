(ns ogbe.fulcro.mui.icons.chat-bubble-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ChatBubbleSharp" :default ChatBubbleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chat-bubble-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChatBubbleSharp)))