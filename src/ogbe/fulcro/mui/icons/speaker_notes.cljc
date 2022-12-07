(ns ogbe.fulcro.mui.icons.speaker-notes
  #?(:cljs (:require
            ["@mui/icons-material/SpeakerNotes" :default SpeakerNotes]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speaker-notes
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpeakerNotes)))