(ns ogbe.fulcro.mui.icons.playlist-add
  #?(:cljs (:require
            ["@mui/icons-material/PlaylistAdd" :default PlaylistAdd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-playlist-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaylistAdd)))