(ns ogbe.fulcro.mui.icons.analytics-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AnalyticsRounded" :default AnalyticsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-analytics-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnalyticsRounded)))