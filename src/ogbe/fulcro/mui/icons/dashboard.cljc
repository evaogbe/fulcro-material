(ns ogbe.fulcro.mui.icons.dashboard
  #?(:cljs (:require
            ["@mui/icons-material/Dashboard" :default Dashboard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dashboard
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Dashboard)))