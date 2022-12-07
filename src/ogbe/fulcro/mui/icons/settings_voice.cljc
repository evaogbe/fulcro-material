(ns ogbe.fulcro.mui.icons.settings-voice
  #?(:cljs (:require
            ["@mui/icons-material/SettingsVoice" :default SettingsVoice]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-voice
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsVoice)))