(ns ogbe.fulcro.mui.icons.camera-roll-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CameraRollRounded" :default CameraRollRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-roll-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraRollRounded)))