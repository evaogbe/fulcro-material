(ns ogbe.fulcro.mui.icons.speaker-phone
  #?(:cljs (:require
            ["@mui/icons-material/SpeakerPhone" :default SpeakerPhone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speaker-phone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpeakerPhone)))