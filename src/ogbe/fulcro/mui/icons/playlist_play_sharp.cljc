(ns ogbe.fulcro.mui.icons.playlist-play-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PlaylistPlaySharp" :default PlaylistPlaySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-playlist-play-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaylistPlaySharp)))