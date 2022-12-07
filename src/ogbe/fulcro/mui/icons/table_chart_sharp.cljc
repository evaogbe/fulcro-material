(ns ogbe.fulcro.mui.icons.table-chart-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TableChartSharp" :default TableChartSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-chart-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableChartSharp)))