(ns ogbe.fulcro.mui.icons.photo-album-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PhotoAlbumRounded" :default PhotoAlbumRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-album-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoAlbumRounded)))