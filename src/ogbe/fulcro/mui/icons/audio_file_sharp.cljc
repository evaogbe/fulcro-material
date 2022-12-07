(ns ogbe.fulcro.mui.icons.audio-file-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AudioFileSharp" :default AudioFileSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-audio-file-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AudioFileSharp)))