(ns ogbe.fulcro.mui.data-display.table-cell
  #?(:cljs (:require
            ["@mui/material/TableCell" :default TableCell]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-table-cell #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory TableCell)))
