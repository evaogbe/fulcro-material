(ns ogbe.fulcro.mui.icons.wallpaper-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WallpaperSharp" :default WallpaperSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wallpaper-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WallpaperSharp)))