(ns ogbe.fulcro.mui.icons.playlist-add-check
  #?(:cljs (:require
            ["@mui/icons-material/PlaylistAddCheck" :default PlaylistAddCheck]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-playlist-add-check
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaylistAddCheck)))