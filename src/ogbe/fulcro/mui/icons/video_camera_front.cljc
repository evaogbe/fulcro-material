(ns ogbe.fulcro.mui.icons.video-camera-front
  #?(:cljs (:require
            ["@mui/icons-material/VideoCameraFront" :default VideoCameraFront]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-camera-front
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoCameraFront)))