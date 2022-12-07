(ns ogbe.fulcro.mui.icons.emergency-recording
  #?(:cljs (:require
            ["@mui/icons-material/EmergencyRecording" :default EmergencyRecording]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emergency-recording
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmergencyRecording)))