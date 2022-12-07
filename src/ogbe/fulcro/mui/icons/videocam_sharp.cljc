(ns ogbe.fulcro.mui.icons.videocam-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VideocamSharp" :default VideocamSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-videocam-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideocamSharp)))