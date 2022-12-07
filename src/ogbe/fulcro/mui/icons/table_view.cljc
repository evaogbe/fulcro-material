(ns ogbe.fulcro.mui.icons.table-view
  #?(:cljs (:require
            ["@mui/icons-material/TableView" :default TableView]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-view
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableView)))