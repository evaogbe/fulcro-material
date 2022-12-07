(ns ogbe.fulcro.mui.data-display.table-container
  #?(:cljs (:require
            ["@mui/material/TableContainer" :default TableContainer]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-table-container #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory TableContainer)))
