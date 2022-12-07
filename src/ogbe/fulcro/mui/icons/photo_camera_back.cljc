(ns ogbe.fulcro.mui.icons.photo-camera-back
  #?(:cljs (:require
            ["@mui/icons-material/PhotoCameraBack" :default PhotoCameraBack]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-camera-back
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoCameraBack)))