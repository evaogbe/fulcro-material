(ns ogbe.fulcro.mui.icons.camera-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CameraRounded" :default CameraRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraRounded)))