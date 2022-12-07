(ns ogbe.fulcro.mui.inputs.button-group
  #?(:cljs (:require
            ["@mui/material/ButtonGroup" :default ButtonGroup]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-button-group #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory ButtonGroup)))
