(ns ogbe.fulcro.mui.icons.keyboard-voice-rounded
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardVoiceRounded" :default KeyboardVoiceRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-voice-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardVoiceRounded)))