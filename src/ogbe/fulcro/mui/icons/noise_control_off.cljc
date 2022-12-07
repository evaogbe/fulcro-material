(ns ogbe.fulcro.mui.icons.noise-control-off
  #?(:cljs (:require
            ["@mui/icons-material/NoiseControlOff" :default NoiseControlOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-noise-control-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoiseControlOff)))