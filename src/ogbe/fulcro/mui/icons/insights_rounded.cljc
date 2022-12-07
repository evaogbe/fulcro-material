(ns ogbe.fulcro.mui.icons.insights-rounded
  #?(:cljs (:require
            ["@mui/icons-material/InsightsRounded" :default InsightsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-insights-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InsightsRounded)))