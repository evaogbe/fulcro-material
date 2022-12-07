(ns ogbe.fulcro.mui.inputs.text-field
  #?(:cljs (:require
            ["@mui/material/TextField" :default TextField]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-text-field #?(:clj  (fn [& _args])
                      :cljs (interop/react-input-factory TextField)))
