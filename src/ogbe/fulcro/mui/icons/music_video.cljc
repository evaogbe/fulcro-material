(ns ogbe.fulcro.mui.icons.music-video
  #?(:cljs (:require
            ["@mui/icons-material/MusicVideo" :default MusicVideo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-music-video
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MusicVideo)))