(ns ogbe.fulcro.mui.icons.voicemail-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VoicemailSharp" :default VoicemailSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-voicemail-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VoicemailSharp)))