(ns ogbe.fulcro.mui.icons.backup-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BackupOutlined" :default BackupOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-backup-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BackupOutlined)))