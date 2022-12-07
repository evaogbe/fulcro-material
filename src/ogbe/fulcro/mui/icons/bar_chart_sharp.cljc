(ns ogbe.fulcro.mui.icons.bar-chart-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BarChartSharp" :default BarChartSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bar-chart-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BarChartSharp)))