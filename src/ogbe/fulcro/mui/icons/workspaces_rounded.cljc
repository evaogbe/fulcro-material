(ns ogbe.fulcro.mui.icons.workspaces-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WorkspacesRounded" :default WorkspacesRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-workspaces-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WorkspacesRounded)))