(ns ogbe.fulcro.mui.icons.video-file
  #?(:cljs (:require
            ["@mui/icons-material/VideoFile" :default VideoFile]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-file
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoFile)))