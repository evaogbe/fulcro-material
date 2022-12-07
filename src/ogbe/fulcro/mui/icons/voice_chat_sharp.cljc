(ns ogbe.fulcro.mui.icons.voice-chat-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VoiceChatSharp" :default VoiceChatSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-voice-chat-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VoiceChatSharp)))