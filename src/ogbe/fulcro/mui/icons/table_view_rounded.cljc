(ns ogbe.fulcro.mui.icons.table-view-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TableViewRounded" :default TableViewRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-view-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableViewRounded)))