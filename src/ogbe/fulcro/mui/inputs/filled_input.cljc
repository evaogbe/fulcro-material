(ns ogbe.fulcro.mui.inputs.filled-input
  #?(:cljs (:require
            ["@mui/material/FilledInput" :default FilledInput]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-filled-input #?(:clj  (fn [& _args])
                        :cljs (interop/react-input-factory FilledInput)))
