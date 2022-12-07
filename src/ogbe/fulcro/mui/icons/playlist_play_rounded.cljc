(ns ogbe.fulcro.mui.icons.playlist-play-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PlaylistPlayRounded" :default PlaylistPlayRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-playlist-play-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaylistPlayRounded)))