(ns ogbe.fulcro.mui.icons.sync-lock-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SyncLockSharp" :default SyncLockSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-lock-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncLockSharp)))