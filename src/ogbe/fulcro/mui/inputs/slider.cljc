(ns ogbe.fulcro.mui.inputs.slider
  #?(:cljs (:require
            ["@mui/material/Slider" :default Slider]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-slider #?(:clj  (fn [& _args])
                  :cljs (interop/react-input-factory Slider)))
