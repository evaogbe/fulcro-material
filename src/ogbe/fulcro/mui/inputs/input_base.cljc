(ns ogbe.fulcro.mui.inputs.input-base
  #?(:cljs (:require
            ["@mui/material/InputBase" :default InputBase]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-input-base #?(:clj  (fn [& _args])
                      :cljs (interop/react-input-factory InputBase)))
