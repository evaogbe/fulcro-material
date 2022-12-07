(ns ogbe.fulcro.mui.icons.table-rows
  #?(:cljs (:require
            ["@mui/icons-material/TableRows" :default TableRows]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-rows
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableRows)))