(ns ogbe.fulcro.mui.icons.backup-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BackupSharp" :default BackupSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-backup-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BackupSharp)))