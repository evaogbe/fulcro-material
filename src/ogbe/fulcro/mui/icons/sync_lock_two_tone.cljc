(ns ogbe.fulcro.mui.icons.sync-lock-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SyncLockTwoTone" :default SyncLockTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-lock-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncLockTwoTone)))