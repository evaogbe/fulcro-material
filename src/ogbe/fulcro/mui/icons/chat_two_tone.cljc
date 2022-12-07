(ns ogbe.fulcro.mui.icons.chat-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ChatTwoTone" :default ChatTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chat-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChatTwoTone)))