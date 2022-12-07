(ns ogbe.fulcro.mui.icons.audio-file-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AudioFileOutlined" :default AudioFileOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-audio-file-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AudioFileOutlined)))