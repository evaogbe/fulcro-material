(ns ogbe.fulcro.mui.icons.photo-camera
  #?(:cljs (:require
            ["@mui/icons-material/PhotoCamera" :default PhotoCamera]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-camera
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoCamera)))