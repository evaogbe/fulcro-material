(ns ogbe.fulcro.mui.icons.settings-backup-restore
  #?(:cljs (:require
            ["@mui/icons-material/SettingsBackupRestore" :default SettingsBackupRestore]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-settings-backup-restore
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SettingsBackupRestore)))