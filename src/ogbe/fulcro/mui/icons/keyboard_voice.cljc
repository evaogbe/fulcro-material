(ns ogbe.fulcro.mui.icons.keyboard-voice
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardVoice" :default KeyboardVoice]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-voice
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardVoice)))