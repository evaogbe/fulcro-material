(ns ogbe.fulcro.mui.inputs.fab
  #?(:cljs (:require
            ["@mui/material/Fab" :default Fab]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-fab #?(:clj  (fn [& _args])
               :cljs (interop/react-factory Fab)))
