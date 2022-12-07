(ns ogbe.fulcro.mui.icons.camera-indoor
  #?(:cljs (:require
            ["@mui/icons-material/CameraIndoor" :default CameraIndoor]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-indoor
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraIndoor)))