(ns ogbe.fulcro.mui.icons.stacked-bar-chart
  #?(:cljs (:require
            ["@mui/icons-material/StackedBarChart" :default StackedBarChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stacked-bar-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StackedBarChart)))