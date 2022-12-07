(ns ogbe.fulcro.mui.icons.videocam-off
  #?(:cljs (:require
            ["@mui/icons-material/VideocamOff" :default VideocamOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-videocam-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideocamOff)))