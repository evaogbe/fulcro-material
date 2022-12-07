(ns ogbe.fulcro.mui.icons.photo-camera-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PhotoCameraSharp" :default PhotoCameraSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-camera-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoCameraSharp)))