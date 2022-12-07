(ns ogbe.fulcro.mui.icons.workspaces-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WorkspacesSharp" :default WorkspacesSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-workspaces-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WorkspacesSharp)))