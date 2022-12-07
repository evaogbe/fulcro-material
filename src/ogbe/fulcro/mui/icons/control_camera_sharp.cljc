(ns ogbe.fulcro.mui.icons.control-camera-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ControlCameraSharp" :default ControlCameraSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-control-camera-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ControlCameraSharp)))