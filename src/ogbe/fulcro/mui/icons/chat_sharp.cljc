(ns ogbe.fulcro.mui.icons.chat-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ChatSharp" :default ChatSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chat-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChatSharp)))