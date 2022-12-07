(ns ogbe.fulcro.mui.icons.video-library-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VideoLibraryRounded" :default VideoLibraryRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-library-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoLibraryRounded)))