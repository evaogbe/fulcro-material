(ns ogbe.fulcro.mui.inputs.form-hepler-text
  #?(:cljs (:require
            ["@mui/material/FormHelperText" :default FormHelperText]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-form-helper-text #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory FormHelperText)))
