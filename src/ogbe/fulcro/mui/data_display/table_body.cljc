(ns ogbe.fulcro.mui.data-display.table-body
  #?(:cljs (:require
            ["@mui/material/TableBody" :default TableBody]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-table-body #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory TableBody)))
