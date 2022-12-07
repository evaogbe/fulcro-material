(ns ogbe.fulcro.mui.icons.view-sidebar-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ViewSidebarRounded" :default ViewSidebarRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-sidebar-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewSidebarRounded)))