(ns ogbe.fulcro.mui.icons.wallpaper-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WallpaperOutlined" :default WallpaperOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wallpaper-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WallpaperOutlined)))