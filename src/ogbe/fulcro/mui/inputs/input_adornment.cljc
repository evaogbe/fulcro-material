(ns ogbe.fulcro.mui.inputs.input-adornment
  #?(:cljs (:require
            ["@mui/material/InputAdornment" :default InputAdornment]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-input-adornment #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory InputAdornment)))
