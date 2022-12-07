(ns ogbe.fulcro.mui.icons.photo-camera-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PhotoCameraOutlined" :default PhotoCameraOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-camera-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoCameraOutlined)))