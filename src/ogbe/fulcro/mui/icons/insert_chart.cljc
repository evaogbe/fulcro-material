(ns ogbe.fulcro.mui.icons.insert-chart
  #?(:cljs (:require
            ["@mui/icons-material/InsertChart" :default InsertChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-insert-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InsertChart)))