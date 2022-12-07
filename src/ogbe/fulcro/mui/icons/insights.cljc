(ns ogbe.fulcro.mui.icons.insights
  #?(:cljs (:require
            ["@mui/icons-material/Insights" :default Insights]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-insights
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Insights)))