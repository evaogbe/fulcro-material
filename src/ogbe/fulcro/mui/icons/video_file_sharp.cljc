(ns ogbe.fulcro.mui.icons.video-file-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VideoFileSharp" :default VideoFileSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-file-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoFileSharp)))