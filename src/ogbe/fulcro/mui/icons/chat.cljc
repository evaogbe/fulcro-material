(ns ogbe.fulcro.mui.icons.chat
  #?(:cljs (:require
            ["@mui/icons-material/Chat" :default Chat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Chat)))