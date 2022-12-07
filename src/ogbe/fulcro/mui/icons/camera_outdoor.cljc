(ns ogbe.fulcro.mui.icons.camera-outdoor
  #?(:cljs (:require
            ["@mui/icons-material/CameraOutdoor" :default CameraOutdoor]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-outdoor
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraOutdoor)))