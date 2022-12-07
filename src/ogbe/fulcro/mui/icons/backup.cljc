(ns ogbe.fulcro.mui.icons.backup
  #?(:cljs (:require
            ["@mui/icons-material/Backup" :default Backup]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-backup
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Backup)))