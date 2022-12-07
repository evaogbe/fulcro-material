(ns ogbe.fulcro.mui.icons.video-call-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VideoCallSharp" :default VideoCallSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-call-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoCallSharp)))