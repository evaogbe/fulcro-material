(ns ogbe.fulcro.mui.icons.backup-table
  #?(:cljs (:require
            ["@mui/icons-material/BackupTable" :default BackupTable]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-backup-table
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BackupTable)))