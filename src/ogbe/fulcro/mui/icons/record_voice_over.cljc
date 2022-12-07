(ns ogbe.fulcro.mui.icons.record-voice-over
  #?(:cljs (:require
            ["@mui/icons-material/RecordVoiceOver" :default RecordVoiceOver]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-record-voice-over
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RecordVoiceOver)))