(ns ogbe.fulcro.mui.icons.dashboard-customize
  #?(:cljs (:require
            ["@mui/icons-material/DashboardCustomize" :default DashboardCustomize]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dashboard-customize
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DashboardCustomize)))