(ns ogbe.fulcro.mui.icons.speaker-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SpeakerSharp" :default SpeakerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speaker-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpeakerSharp)))