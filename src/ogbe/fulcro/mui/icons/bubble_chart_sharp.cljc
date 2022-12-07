(ns ogbe.fulcro.mui.icons.bubble-chart-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BubbleChartSharp" :default BubbleChartSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bubble-chart-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BubbleChartSharp)))