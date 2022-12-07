(ns ogbe.fulcro.mui.icons.bubble-chart
  #?(:cljs (:require
            ["@mui/icons-material/BubbleChart" :default BubbleChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bubble-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BubbleChart)))