(ns ogbe.fulcro.mui.icons.sync-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SyncRounded" :default SyncRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncRounded)))