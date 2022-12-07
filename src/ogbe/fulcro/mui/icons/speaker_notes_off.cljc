(ns ogbe.fulcro.mui.icons.speaker-notes-off
  #?(:cljs (:require
            ["@mui/icons-material/SpeakerNotesOff" :default SpeakerNotesOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speaker-notes-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpeakerNotesOff)))