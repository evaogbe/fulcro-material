(ns ogbe.fulcro.mui.icons.chat-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ChatOutlined" :default ChatOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chat-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChatOutlined)))