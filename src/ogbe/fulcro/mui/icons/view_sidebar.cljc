(ns ogbe.fulcro.mui.icons.view-sidebar
  #?(:cljs (:require
            ["@mui/icons-material/ViewSidebar" :default ViewSidebar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-sidebar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewSidebar)))