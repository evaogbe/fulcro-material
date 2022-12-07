(ns ogbe.fulcro.mui.icons.video-stable
  #?(:cljs (:require
            ["@mui/icons-material/VideoStable" :default VideoStable]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-stable
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoStable)))