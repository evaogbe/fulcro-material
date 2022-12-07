(ns ogbe.fulcro.mui.icons.switch-camera
  #?(:cljs (:require
            ["@mui/icons-material/SwitchCamera" :default SwitchCamera]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-switch-camera
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwitchCamera)))