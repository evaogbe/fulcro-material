(ns ogbe.fulcro.mui.icons.voicemail-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/VoicemailTwoTone" :default VoicemailTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-voicemail-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VoicemailTwoTone)))