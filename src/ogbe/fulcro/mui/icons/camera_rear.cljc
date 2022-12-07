(ns ogbe.fulcro.mui.icons.camera-rear
  #?(:cljs (:require
            ["@mui/icons-material/CameraRear" :default CameraRear]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-rear
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraRear)))