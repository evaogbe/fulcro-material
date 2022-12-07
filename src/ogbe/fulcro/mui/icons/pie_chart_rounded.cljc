(ns ogbe.fulcro.mui.icons.pie-chart-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PieChartRounded" :default PieChartRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pie-chart-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PieChartRounded)))