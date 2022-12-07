(ns ogbe.fulcro.mui.icons.videocam-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VideocamRounded" :default VideocamRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-videocam-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideocamRounded)))