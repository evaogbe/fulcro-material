(ns ogbe.fulcro.mui.icons.sync-lock-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SyncLockRounded" :default SyncLockRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-lock-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncLockRounded)))