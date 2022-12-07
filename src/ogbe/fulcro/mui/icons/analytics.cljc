(ns ogbe.fulcro.mui.icons.analytics
  #?(:cljs (:require
            ["@mui/icons-material/Analytics" :default Analytics]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-analytics
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Analytics)))