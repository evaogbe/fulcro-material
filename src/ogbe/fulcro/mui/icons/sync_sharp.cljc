(ns ogbe.fulcro.mui.icons.sync-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SyncSharp" :default SyncSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncSharp)))