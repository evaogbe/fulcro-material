(ns ogbe.fulcro.mui.icons.switch-camera-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SwitchCameraRounded" :default SwitchCameraRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-switch-camera-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwitchCameraRounded)))