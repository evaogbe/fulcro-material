(ns ogbe.fulcro.mui.icons.voice-over-off
  #?(:cljs (:require
            ["@mui/icons-material/VoiceOverOff" :default VoiceOverOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-voice-over-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VoiceOverOff)))