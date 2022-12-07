(ns ogbe.fulcro.mui.icons.candlestick-chart
  #?(:cljs (:require
            ["@mui/icons-material/CandlestickChart" :default CandlestickChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-candlestick-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CandlestickChart)))