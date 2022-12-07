(ns ogbe.fulcro.mui.inputs.input-label
  #?(:cljs (:require
            ["@mui/material/InputLabel" :default InputLabel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-input-label #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory InputLabel)))
