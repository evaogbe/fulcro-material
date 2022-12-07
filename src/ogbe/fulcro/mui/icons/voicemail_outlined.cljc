(ns ogbe.fulcro.mui.icons.voicemail-outlined
  #?(:cljs (:require
            ["@mui/icons-material/VoicemailOutlined" :default VoicemailOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-voicemail-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VoicemailOutlined)))