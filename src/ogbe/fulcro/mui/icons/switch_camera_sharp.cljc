(ns ogbe.fulcro.mui.icons.switch-camera-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SwitchCameraSharp" :default SwitchCameraSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-switch-camera-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwitchCameraSharp)))