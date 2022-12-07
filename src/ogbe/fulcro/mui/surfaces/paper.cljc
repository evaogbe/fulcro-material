(ns ogbe.fulcro.mui.surfaces.paper
  #?(:cljs (:require
            ["@mui/material/Paper" :default Paper]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-paper #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Paper)))
