(ns ogbe.fulcro.mui.inputs.autocomplete
  #?(:cljs (:require
            ["@mui/material/Autocomplete" :default Autocomplete]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-autocomplete #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory Autocomplete)))
