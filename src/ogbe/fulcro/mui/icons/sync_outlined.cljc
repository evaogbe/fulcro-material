(ns ogbe.fulcro.mui.icons.sync-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SyncOutlined" :default SyncOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sync-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SyncOutlined)))