(ns ogbe.fulcro.mui.icons.stacked-line-chart
  #?(:cljs (:require
            ["@mui/icons-material/StackedLineChart" :default StackedLineChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stacked-line-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StackedLineChart)))