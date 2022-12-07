(ns ogbe.fulcro.mui.icons.camera-roll-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CameraRollOutlined" :default CameraRollOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-roll-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraRollOutlined)))