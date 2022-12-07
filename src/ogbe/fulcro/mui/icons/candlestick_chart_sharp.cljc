(ns ogbe.fulcro.mui.icons.candlestick-chart-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CandlestickChartSharp" :default CandlestickChartSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-candlestick-chart-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CandlestickChartSharp)))