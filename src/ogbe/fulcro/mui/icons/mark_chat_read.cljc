(ns ogbe.fulcro.mui.icons.mark-chat-read
  #?(:cljs (:require
            ["@mui/icons-material/MarkChatRead" :default MarkChatRead]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mark-chat-read
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MarkChatRead)))