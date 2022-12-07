(ns ogbe.fulcro.mui.icons.voicemail-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VoicemailRounded" :default VoicemailRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-voicemail-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VoicemailRounded)))