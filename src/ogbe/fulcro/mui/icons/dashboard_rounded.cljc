(ns ogbe.fulcro.mui.icons.dashboard-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DashboardRounded" :default DashboardRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dashboard-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DashboardRounded)))