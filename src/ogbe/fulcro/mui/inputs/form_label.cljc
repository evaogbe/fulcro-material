(ns ogbe.fulcro.mui.inputs.form-label
  #?(:cljs (:require
            ["@mui/material/FormLabel" :default FormLabel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-form-label #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory FormLabel)))
