(ns ogbe.fulcro.mui.icons.table-rows-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TableRowsOutlined" :default TableRowsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-rows-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableRowsOutlined)))