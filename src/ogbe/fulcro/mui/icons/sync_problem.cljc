(ns ogbe.fulcro.mui.icons.sync-problem
  #?(:cljs (:require
            ["@mui/icons-material/SyncProblem" :default SyncProblem]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-problem
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncProblem)))