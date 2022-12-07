(ns ogbe.fulcro.mui.icons.speaker-notes-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SpeakerNotesOutlined" :default SpeakerNotesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speaker-notes-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpeakerNotesOutlined)))