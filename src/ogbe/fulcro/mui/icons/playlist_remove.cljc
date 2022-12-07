(ns ogbe.fulcro.mui.icons.playlist-remove
  #?(:cljs (:require
            ["@mui/icons-material/PlaylistRemove" :default PlaylistRemove]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-playlist-remove
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaylistRemove)))