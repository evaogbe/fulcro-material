(ns ogbe.fulcro.mui.icons.video-camera-back
  #?(:cljs (:require
            ["@mui/icons-material/VideoCameraBack" :default VideoCameraBack]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-camera-back
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoCameraBack)))