(ns ogbe.fulcro.mui.icons.scatter-plot
  #?(:cljs (:require
            ["@mui/icons-material/ScatterPlot" :default ScatterPlot]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scatter-plot
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScatterPlot)))