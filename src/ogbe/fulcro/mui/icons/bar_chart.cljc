(ns ogbe.fulcro.mui.icons.bar-chart
  #?(:cljs (:require
            ["@mui/icons-material/BarChart" :default BarChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bar-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BarChart)))