(ns ogbe.fulcro.mui.icons.storage-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StorageRounded" :default StorageRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storage-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StorageRounded)))