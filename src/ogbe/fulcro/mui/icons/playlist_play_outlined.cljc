(ns ogbe.fulcro.mui.icons.playlist-play-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PlaylistPlayOutlined" :default PlaylistPlayOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-playlist-play-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaylistPlayOutlined)))