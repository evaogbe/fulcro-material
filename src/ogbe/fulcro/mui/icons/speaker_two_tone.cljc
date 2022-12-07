(ns ogbe.fulcro.mui.icons.speaker-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SpeakerTwoTone" :default SpeakerTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speaker-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpeakerTwoTone)))