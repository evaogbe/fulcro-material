(ns ogbe.fulcro.mui.icons.sync-disabled-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SyncDisabledRounded" :default SyncDisabledRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-disabled-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncDisabledRounded)))