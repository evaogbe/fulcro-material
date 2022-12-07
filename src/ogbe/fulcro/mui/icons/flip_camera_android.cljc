(ns ogbe.fulcro.mui.icons.flip-camera-android
  #?(:cljs (:require
            ["@mui/icons-material/FlipCameraAndroid" :default FlipCameraAndroid]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flip-camera-android
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlipCameraAndroid)))