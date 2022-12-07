(ns ogbe.fulcro.mui.icons.camera-alt
  #?(:cljs (:require
            ["@mui/icons-material/CameraAlt" :default CameraAlt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-alt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraAlt)))