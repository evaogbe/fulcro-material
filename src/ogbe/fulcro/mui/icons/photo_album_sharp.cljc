(ns ogbe.fulcro.mui.icons.photo-album-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PhotoAlbumSharp" :default PhotoAlbumSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-album-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoAlbumSharp)))