(ns ogbe.fulcro.mui.icons.scatter-plot-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ScatterPlotSharp" :default ScatterPlotSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-scatter-plot-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScatterPlotSharp)))