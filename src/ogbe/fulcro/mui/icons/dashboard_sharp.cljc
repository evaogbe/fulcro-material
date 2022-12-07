(ns ogbe.fulcro.mui.icons.dashboard-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DashboardSharp" :default DashboardSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dashboard-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DashboardSharp)))