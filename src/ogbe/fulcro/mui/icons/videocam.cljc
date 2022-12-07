(ns ogbe.fulcro.mui.icons.videocam
  #?(:cljs (:require
            ["@mui/icons-material/Videocam" :default Videocam]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-videocam
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Videocam)))