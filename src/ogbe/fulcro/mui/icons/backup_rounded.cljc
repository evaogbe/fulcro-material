(ns ogbe.fulcro.mui.icons.backup-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BackupRounded" :default BackupRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-backup-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BackupRounded)))