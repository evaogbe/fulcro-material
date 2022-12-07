(ns ogbe.fulcro.mui.icons.bubble-chart-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BubbleChartRounded" :default BubbleChartRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bubble-chart-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BubbleChartRounded)))