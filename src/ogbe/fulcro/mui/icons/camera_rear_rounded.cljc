(ns ogbe.fulcro.mui.icons.camera-rear-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CameraRearRounded" :default CameraRearRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-rear-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraRearRounded)))