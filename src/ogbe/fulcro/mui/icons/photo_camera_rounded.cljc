(ns ogbe.fulcro.mui.icons.photo-camera-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PhotoCameraRounded" :default PhotoCameraRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-camera-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoCameraRounded)))