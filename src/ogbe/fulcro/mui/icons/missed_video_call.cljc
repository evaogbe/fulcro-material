(ns ogbe.fulcro.mui.icons.missed-video-call
  #?(:cljs (:require
            ["@mui/icons-material/MissedVideoCall" :default MissedVideoCall]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-missed-video-call
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MissedVideoCall)))