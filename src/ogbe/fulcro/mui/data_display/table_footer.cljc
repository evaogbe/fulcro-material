(ns ogbe.fulcro.mui.data-display.table-footer
  #?(:cljs (:require
            ["@mui/material/TableFooter" :default TableFooter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-table-footer #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory TableFooter)))
