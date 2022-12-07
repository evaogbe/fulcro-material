(ns ogbe.fulcro.mui.icons.playlist-add-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PlaylistAddRounded" :default PlaylistAddRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-playlist-add-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaylistAddRounded)))