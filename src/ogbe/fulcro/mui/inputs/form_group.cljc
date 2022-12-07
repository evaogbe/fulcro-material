(ns ogbe.fulcro.mui.inputs.form-group
  #?(:cljs (:require
            ["@mui/material/FormGroup" :default FormGroup]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-form-group #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory FormGroup)))
