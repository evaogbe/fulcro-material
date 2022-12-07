(ns ogbe.fulcro.mui.icons.wallpaper-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WallpaperRounded" :default WallpaperRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wallpaper-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WallpaperRounded)))