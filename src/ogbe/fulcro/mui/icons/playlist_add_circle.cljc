(ns ogbe.fulcro.mui.icons.playlist-add-circle
  #?(:cljs (:require
            ["@mui/icons-material/PlaylistAddCircle" :default PlaylistAddCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-playlist-add-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlaylistAddCircle)))