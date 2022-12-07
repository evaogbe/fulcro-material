(ns ogbe.fulcro.mui.icons.keyboard-voice-sharp
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardVoiceSharp" :default KeyboardVoiceSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-voice-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardVoiceSharp)))