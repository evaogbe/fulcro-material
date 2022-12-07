(ns ogbe.fulcro.mui.icons.sync-lock
  #?(:cljs (:require
            ["@mui/icons-material/SyncLock" :default SyncLock]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-lock
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncLock)))