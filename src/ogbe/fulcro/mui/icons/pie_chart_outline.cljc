(ns ogbe.fulcro.mui.icons.pie-chart-outline
  #?(:cljs (:require
            ["@mui/icons-material/PieChartOutline" :default PieChartOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pie-chart-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PieChartOutline)))