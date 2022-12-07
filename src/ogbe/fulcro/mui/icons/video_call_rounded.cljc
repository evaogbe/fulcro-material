(ns ogbe.fulcro.mui.icons.video-call-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VideoCallRounded" :default VideoCallRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-call-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoCallRounded)))