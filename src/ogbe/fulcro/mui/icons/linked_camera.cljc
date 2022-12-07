(ns ogbe.fulcro.mui.icons.linked-camera
  #?(:cljs (:require
            ["@mui/icons-material/LinkedCamera" :default LinkedCamera]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-linked-camera
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LinkedCamera)))