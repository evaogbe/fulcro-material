(ns ogbe.fulcro.mui.icons.camera-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CameraSharp" :default CameraSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraSharp)))