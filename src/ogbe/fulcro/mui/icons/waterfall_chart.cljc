(ns ogbe.fulcro.mui.icons.waterfall-chart
  #?(:cljs (:require
            ["@mui/icons-material/WaterfallChart" :default WaterfallChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-waterfall-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WaterfallChart)))