(ns ogbe.fulcro.mui.icons.wallpaper
  #?(:cljs (:require
            ["@mui/icons-material/Wallpaper" :default Wallpaper]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wallpaper
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Wallpaper)))