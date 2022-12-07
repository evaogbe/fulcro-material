(ns ogbe.fulcro.mui.icons.video-call
  #?(:cljs (:require
            ["@mui/icons-material/VideoCall" :default VideoCall]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-call
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoCall)))