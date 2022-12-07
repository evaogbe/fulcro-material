(ns ogbe.fulcro.mui.layout.grid
  #?(:cljs (:require
            ["@mui/material/Grid" :default Grid]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-grid #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Grid)))
