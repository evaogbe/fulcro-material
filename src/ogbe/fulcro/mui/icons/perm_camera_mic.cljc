(ns ogbe.fulcro.mui.icons.perm-camera-mic
  #?(:cljs (:require
            ["@mui/icons-material/PermCameraMic" :default PermCameraMic]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-perm-camera-mic
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PermCameraMic)))