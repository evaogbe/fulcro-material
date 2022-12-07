(ns ogbe.fulcro.mui.icons.camera
  #?(:cljs (:require
            ["@mui/icons-material/Camera" :default Camera]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Camera)))