(ns ogbe.fulcro.mui.data-display.table-pagination
  #?(:cljs (:require
            ["@mui/material/TablePagination" :default TablePagination]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-table-pagination
  "Use synchronous transact for onRowsPerPageChange."
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TablePagination)))
