(ns ogbe.fulcro.mui.icons.bar-chart-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BarChartRounded" :default BarChartRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bar-chart-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BarChartRounded)))