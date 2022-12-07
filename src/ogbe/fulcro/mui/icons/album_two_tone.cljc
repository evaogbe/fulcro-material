(ns ogbe.fulcro.mui.icons.album-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/AlbumTwoTone" :default AlbumTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-album-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlbumTwoTone)))