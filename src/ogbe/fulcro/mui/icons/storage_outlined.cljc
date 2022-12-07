(ns ogbe.fulcro.mui.icons.storage-outlined
  #?(:cljs (:require
            ["@mui/icons-material/StorageOutlined" :default StorageOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storage-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StorageOutlined)))