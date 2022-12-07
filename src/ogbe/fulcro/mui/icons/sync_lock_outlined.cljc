(ns ogbe.fulcro.mui.icons.sync-lock-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SyncLockOutlined" :default SyncLockOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-lock-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncLockOutlined)))