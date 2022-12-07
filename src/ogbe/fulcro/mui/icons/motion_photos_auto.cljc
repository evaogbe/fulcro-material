(ns ogbe.fulcro.mui.icons.motion-photos-auto
  #?(:cljs (:require
            ["@mui/icons-material/MotionPhotosAuto" :default MotionPhotosAuto]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-motion-photos-auto
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MotionPhotosAuto)))