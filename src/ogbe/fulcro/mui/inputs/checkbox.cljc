(ns ogbe.fulcro.mui.inputs.checkbox
  #?(:cljs (:require
            ["@mui/material/Checkbox" :default Checkbox]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-checkbox #?(:clj  (fn [& _args])
                    :cljs (interop/react-input-factory Checkbox)))
