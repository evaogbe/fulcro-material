(ns ogbe.fulcro.mui.inputs.form-control-label
  #?(:cljs (:require
            ["@mui/material/FormControlLabel" :default FormControlLabel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-form-control-label #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory FormControlLabel)))
