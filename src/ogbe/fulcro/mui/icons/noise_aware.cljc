(ns ogbe.fulcro.mui.icons.noise-aware
  #?(:cljs (:require
            ["@mui/icons-material/NoiseAware" :default NoiseAware]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-noise-aware
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoiseAware)))