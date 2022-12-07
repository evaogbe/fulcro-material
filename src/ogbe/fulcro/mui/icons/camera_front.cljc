(ns ogbe.fulcro.mui.icons.camera-front
  #?(:cljs (:require
            ["@mui/icons-material/CameraFront" :default CameraFront]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-front
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraFront)))