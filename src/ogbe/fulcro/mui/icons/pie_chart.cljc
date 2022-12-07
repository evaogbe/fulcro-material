(ns ogbe.fulcro.mui.icons.pie-chart
  #?(:cljs (:require
            ["@mui/icons-material/PieChart" :default PieChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pie-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PieChart)))