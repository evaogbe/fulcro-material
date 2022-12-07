(ns ogbe.fulcro.mui.icons.audio-file-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AudioFileRounded" :default AudioFileRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-audio-file-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AudioFileRounded)))