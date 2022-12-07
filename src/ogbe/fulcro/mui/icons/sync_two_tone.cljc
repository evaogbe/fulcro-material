(ns ogbe.fulcro.mui.icons.sync-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SyncTwoTone" :default SyncTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncTwoTone)))