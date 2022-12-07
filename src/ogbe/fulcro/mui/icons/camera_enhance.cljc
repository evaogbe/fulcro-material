(ns ogbe.fulcro.mui.icons.camera-enhance
  #?(:cljs (:require
            ["@mui/icons-material/CameraEnhance" :default CameraEnhance]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-enhance
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraEnhance)))