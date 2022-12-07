(ns ogbe.fulcro.mui.icons.insights-sharp
  #?(:cljs (:require
            ["@mui/icons-material/InsightsSharp" :default InsightsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-insights-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InsightsSharp)))