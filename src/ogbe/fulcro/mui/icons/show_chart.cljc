(ns ogbe.fulcro.mui.icons.show-chart
  #?(:cljs (:require
            ["@mui/icons-material/ShowChart" :default ShowChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-show-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShowChart)))