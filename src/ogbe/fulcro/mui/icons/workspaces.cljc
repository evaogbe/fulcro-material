(ns ogbe.fulcro.mui.icons.workspaces
  #?(:cljs (:require
            ["@mui/icons-material/Workspaces" :default Workspaces]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-workspaces
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Workspaces)))