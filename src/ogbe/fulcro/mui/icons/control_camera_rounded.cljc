(ns ogbe.fulcro.mui.icons.control-camera-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ControlCameraRounded" :default ControlCameraRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-control-camera-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ControlCameraRounded)))