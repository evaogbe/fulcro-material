(ns ogbe.fulcro.mui.icons.pie-chart-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PieChartSharp" :default PieChartSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pie-chart-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PieChartSharp)))