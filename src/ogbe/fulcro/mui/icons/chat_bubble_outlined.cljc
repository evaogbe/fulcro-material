(ns ogbe.fulcro.mui.icons.chat-bubble-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ChatBubbleOutlined" :default ChatBubbleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chat-bubble-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChatBubbleOutlined)))