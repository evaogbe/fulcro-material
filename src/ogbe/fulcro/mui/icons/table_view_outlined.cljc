(ns ogbe.fulcro.mui.icons.table-view-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TableViewOutlined" :default TableViewOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-view-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableViewOutlined)))