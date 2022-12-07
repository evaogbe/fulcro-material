(ns ogbe.fulcro.mui.icons.table-view-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TableViewSharp" :default TableViewSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-view-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableViewSharp)))