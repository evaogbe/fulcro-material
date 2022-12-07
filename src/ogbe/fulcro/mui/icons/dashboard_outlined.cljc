(ns ogbe.fulcro.mui.icons.dashboard-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DashboardOutlined" :default DashboardOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dashboard-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DashboardOutlined)))