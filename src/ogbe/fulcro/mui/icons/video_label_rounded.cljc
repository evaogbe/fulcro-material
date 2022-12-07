(ns ogbe.fulcro.mui.icons.video-label-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VideoLabelRounded" :default VideoLabelRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-label-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoLabelRounded)))