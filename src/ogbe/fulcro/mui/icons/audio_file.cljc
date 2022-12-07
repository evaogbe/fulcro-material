(ns ogbe.fulcro.mui.icons.audio-file
  #?(:cljs (:require
            ["@mui/icons-material/AudioFile" :default AudioFile]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-audio-file
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AudioFile)))