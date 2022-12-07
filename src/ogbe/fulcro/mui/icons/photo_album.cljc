(ns ogbe.fulcro.mui.icons.photo-album
  #?(:cljs (:require
            ["@mui/icons-material/PhotoAlbum" :default PhotoAlbum]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-album
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoAlbum)))