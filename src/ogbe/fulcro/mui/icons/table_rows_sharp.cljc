(ns ogbe.fulcro.mui.icons.table-rows-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TableRowsSharp" :default TableRowsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-rows-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableRowsSharp)))