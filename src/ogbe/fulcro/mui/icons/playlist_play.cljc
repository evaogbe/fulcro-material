(ns ogbe.fulcro.mui.icons.playlist-play
  #?(:cljs (:require
            ["@mui/icons-material/PlaylistPlay" :default PlaylistPlay]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-playlist-play
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaylistPlay)))