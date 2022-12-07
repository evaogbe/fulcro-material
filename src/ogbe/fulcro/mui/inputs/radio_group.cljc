(ns ogbe.fulcro.mui.inputs.radio-group
  #?(:cljs (:require
            ["@mui/material/RadioGroup" :default RadioGroup]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-radio-group #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory RadioGroup)))
