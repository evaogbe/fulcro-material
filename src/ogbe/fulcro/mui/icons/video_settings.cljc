(ns ogbe.fulcro.mui.icons.video-settings
  #?(:cljs (:require
            ["@mui/icons-material/VideoSettings" :default VideoSettings]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-video-settings
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideoSettings)))