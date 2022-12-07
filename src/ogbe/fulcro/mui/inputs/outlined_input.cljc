(ns ogbe.fulcro.mui.inputs.outlined-input
  #?(:cljs (:require
            ["@mui/material/OutlinedInput" :default OutlinedInput]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-outlined-input #?(:clj  (fn [& _args])
                          :cljs (interop/react-input-factory OutlinedInput)))
