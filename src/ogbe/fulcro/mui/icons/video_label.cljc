(ns ogbe.fulcro.mui.icons.video-label
  #?(:cljs (:require
            ["@mui/icons-material/VideoLabel" :default VideoLabel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-label
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoLabel)))