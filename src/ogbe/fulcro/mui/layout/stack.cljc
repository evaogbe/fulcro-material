(ns ogbe.fulcro.mui.layout.stack
  #?(:cljs (:require
            ["@mui/material/Stack" :default Stack]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-stack #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Stack)))
