(ns ogbe.fulcro.mui.icons.view-sidebar-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ViewSidebarOutlined" :default ViewSidebarOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-sidebar-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewSidebarOutlined)))