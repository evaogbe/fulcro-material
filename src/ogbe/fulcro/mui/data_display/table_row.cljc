(ns ogbe.fulcro.mui.data-display.table-row
  #?(:cljs (:require
            ["@mui/material/TableRow" :default TableRow]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-table-row #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory TableRow)))
