(ns ogbe.fulcro.mui.icons.sync-disabled
  #?(:cljs (:require
            ["@mui/icons-material/SyncDisabled" :default SyncDisabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-disabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncDisabled)))