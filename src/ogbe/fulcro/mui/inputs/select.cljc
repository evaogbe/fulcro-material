(ns ogbe.fulcro.mui.inputs.select
  #?(:cljs (:require
            ["@mui/material/Select" :default Select]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-select #?(:clj  (fn [& _args])
                  :cljs (interop/react-input-factory Select)))
