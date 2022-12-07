(ns ogbe.fulcro.mui.icons.album-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AlbumOutlined" :default AlbumOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-album-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlbumOutlined)))