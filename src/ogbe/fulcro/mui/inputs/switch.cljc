(ns ogbe.fulcro.mui.inputs.switch
  #?(:cljs (:require
            ["@mui/material/Switch" :default Switch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-switch #?(:clj  (fn [& _args])
                  :cljs (interop/react-input-factory Switch)))
