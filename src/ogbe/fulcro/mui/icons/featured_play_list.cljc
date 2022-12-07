(ns ogbe.fulcro.mui.icons.featured-play-list
  #?(:cljs (:require
            ["@mui/icons-material/FeaturedPlayList" :default FeaturedPlayList]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-featured-play-list
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FeaturedPlayList)))