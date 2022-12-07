(ns ogbe.fulcro.mui.icons.table-chart
  #?(:cljs (:require
            ["@mui/icons-material/TableChart" :default TableChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableChart)))