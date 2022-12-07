(ns ogbe.fulcro.mui.icons.chat-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ChatRounded" :default ChatRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chat-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChatRounded)))