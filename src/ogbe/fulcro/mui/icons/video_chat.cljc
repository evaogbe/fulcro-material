(ns ogbe.fulcro.mui.icons.video-chat
  #?(:cljs (:require
            ["@mui/icons-material/VideoChat" :default VideoChat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-chat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoChat)))