(ns ogbe.fulcro.mui.icons.workspace-premium
  #?(:cljs (:require
            ["@mui/icons-material/WorkspacePremium" :default WorkspacePremium]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-workspace-premium
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WorkspacePremium)))