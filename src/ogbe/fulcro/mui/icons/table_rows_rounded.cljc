(ns ogbe.fulcro.mui.icons.table-rows-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TableRowsRounded" :default TableRowsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-rows-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableRowsRounded)))