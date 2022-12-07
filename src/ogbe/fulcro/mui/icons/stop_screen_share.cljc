(ns ogbe.fulcro.mui.icons.stop-screen-share
  #?(:cljs (:require
            ["@mui/icons-material/StopScreenShare" :default StopScreenShare]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stop-screen-share
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StopScreenShare)))