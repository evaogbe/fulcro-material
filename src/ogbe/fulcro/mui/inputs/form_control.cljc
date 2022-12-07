(ns ogbe.fulcro.mui.inputs.form-control
  #?(:cljs (:require
            ["@mui/material/FormControl" :default FormControl]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-form-control #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory FormControl)))
