(ns ogbe.fulcro.mui.icons.analytics-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AnalyticsSharp" :default AnalyticsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-analytics-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnalyticsSharp)))