(ns ogbe.fulcro.mui.icons.analytics-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AnalyticsOutlined" :default AnalyticsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-analytics-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnalyticsOutlined)))