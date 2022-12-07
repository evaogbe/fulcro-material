(ns ogbe.fulcro.mui.icons.video-call-outlined
  #?(:cljs (:require
            ["@mui/icons-material/VideoCallOutlined" :default VideoCallOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-call-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoCallOutlined)))