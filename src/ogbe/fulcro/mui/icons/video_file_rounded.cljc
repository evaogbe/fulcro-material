(ns ogbe.fulcro.mui.icons.video-file-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VideoFileRounded" :default VideoFileRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-file-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoFileRounded)))