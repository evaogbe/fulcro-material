(ns ogbe.fulcro.mui.icons.voice-chat
  #?(:cljs (:require
            ["@mui/icons-material/VoiceChat" :default VoiceChat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-voice-chat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VoiceChat)))