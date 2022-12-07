(ns ogbe.fulcro.mui.icons.control-camera
  #?(:cljs (:require
            ["@mui/icons-material/ControlCamera" :default ControlCamera]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-control-camera
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ControlCamera)))