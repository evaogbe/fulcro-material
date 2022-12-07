(ns ogbe.fulcro.mui.icons.workspaces-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WorkspacesOutlined" :default WorkspacesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-workspaces-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WorkspacesOutlined)))