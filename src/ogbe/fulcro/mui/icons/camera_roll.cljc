(ns ogbe.fulcro.mui.icons.camera-roll
  #?(:cljs (:require
            ["@mui/icons-material/CameraRoll" :default CameraRoll]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-roll
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraRoll)))