(ns ogbe.fulcro.mui.data-display.table-head
  #?(:cljs (:require
            ["@mui/material/TableHead" :default TableHead]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-table-head #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory TableHead)))
