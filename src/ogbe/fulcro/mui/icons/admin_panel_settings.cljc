(ns ogbe.fulcro.mui.icons.admin-panel-settings
  #?(:cljs (:require
            ["@mui/icons-material/AdminPanelSettings" :default AdminPanelSettings]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-admin-panel-settings
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AdminPanelSettings)))