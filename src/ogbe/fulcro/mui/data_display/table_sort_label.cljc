(ns ogbe.fulcro.mui.data-display.table-sort-label
  #?(:cljs (:require
            ["@mui/material/TableSortLabel" :default TableSortLabel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-table-sort-label #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory TableSortLabel)))
