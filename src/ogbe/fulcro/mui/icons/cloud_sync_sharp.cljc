(ns ogbe.fulcro.mui.icons.cloud-sync-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CloudSyncSharp" :default CloudSyncSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-sync-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudSyncSharp)))