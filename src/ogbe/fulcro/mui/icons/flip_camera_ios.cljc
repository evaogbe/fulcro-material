(ns ogbe.fulcro.mui.icons.flip-camera-ios
  #?(:cljs (:require
            ["@mui/icons-material/FlipCameraIos" :default FlipCameraIos]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flip-camera-ios
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlipCameraIos)))