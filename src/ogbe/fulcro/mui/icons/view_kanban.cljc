(ns ogbe.fulcro.mui.icons.view-kanban
  #?(:cljs (:require
            ["@mui/icons-material/ViewKanban" :default ViewKanban]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-kanban
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewKanban)))