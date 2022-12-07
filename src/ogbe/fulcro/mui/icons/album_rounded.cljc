(ns ogbe.fulcro.mui.icons.album-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AlbumRounded" :default AlbumRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-album-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlbumRounded)))