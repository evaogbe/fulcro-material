(ns ogbe.fulcro.mui.icons.camera-roll-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CameraRollSharp" :default CameraRollSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-roll-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraRollSharp)))