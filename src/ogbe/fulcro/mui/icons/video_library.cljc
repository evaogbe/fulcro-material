(ns ogbe.fulcro.mui.icons.video-library
  #?(:cljs (:require
            ["@mui/icons-material/VideoLibrary" :default VideoLibrary]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-library
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoLibrary)))