(ns ogbe.fulcro.mui.icons.music-note
  #?(:cljs (:require
            ["@mui/icons-material/MusicNote" :default MusicNote]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-music-note
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MusicNote)))