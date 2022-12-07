(ns ogbe.fulcro.mui.icons.dashboard-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DashboardTwoTone" :default DashboardTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dashboard-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DashboardTwoTone)))