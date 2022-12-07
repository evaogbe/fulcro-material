(ns ogbe.fulcro.mui.inputs.input
  #?(:cljs (:require
            ["@mui/material/Input" :default Input]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-input #?(:clj  (fn [& _args])
                 :cljs (interop/react-input-factory Input)))
