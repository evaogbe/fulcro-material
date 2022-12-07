(ns ogbe.fulcro.mui.icons.album-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AlbumSharp" :default AlbumSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-album-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlbumSharp)))