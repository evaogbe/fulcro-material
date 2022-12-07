(ns ogbe.fulcro.mui.icons.pivot-table-chart
  #?(:cljs (:require
            ["@mui/icons-material/PivotTableChart" :default PivotTableChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pivot-table-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PivotTableChart)))