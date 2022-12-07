(ns ogbe.fulcro.mui.inputs.toggle-button-group
  #?(:cljs (:require
            ["@mui/material/ToggleButtonGroup" :default ToggleButtonGroup]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-toggle-button-group #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory ToggleButtonGroup)))
