(ns ogbe.fulcro.mui.inputs.toggle-button
  #?(:cljs (:require
            ["@mui/material/ToggleButton" :default ToggleButton]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-toggle-button #?(:clj  (fn [& _args])
                         :cljs (interop/react-factory ToggleButton)))
