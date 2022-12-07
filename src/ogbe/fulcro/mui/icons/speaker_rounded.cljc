(ns ogbe.fulcro.mui.icons.speaker-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SpeakerRounded" :default SpeakerRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speaker-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpeakerRounded)))