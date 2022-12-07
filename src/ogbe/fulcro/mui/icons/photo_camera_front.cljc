(ns ogbe.fulcro.mui.icons.photo-camera-front
  #?(:cljs (:require
            ["@mui/icons-material/PhotoCameraFront" :default PhotoCameraFront]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-camera-front
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoCameraFront)))