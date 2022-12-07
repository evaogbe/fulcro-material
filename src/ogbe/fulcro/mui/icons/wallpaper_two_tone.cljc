(ns ogbe.fulcro.mui.icons.wallpaper-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WallpaperTwoTone" :default WallpaperTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wallpaper-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WallpaperTwoTone)))