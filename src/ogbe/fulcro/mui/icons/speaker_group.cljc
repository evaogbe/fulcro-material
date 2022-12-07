(ns ogbe.fulcro.mui.icons.speaker-group
  #?(:cljs (:require
            ["@mui/icons-material/SpeakerGroup" :default SpeakerGroup]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speaker-group
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpeakerGroup)))