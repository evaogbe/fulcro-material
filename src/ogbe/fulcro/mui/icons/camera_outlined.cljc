(ns ogbe.fulcro.mui.icons.camera-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CameraOutlined" :default CameraOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraOutlined)))