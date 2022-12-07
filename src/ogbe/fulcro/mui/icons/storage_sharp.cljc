(ns ogbe.fulcro.mui.icons.storage-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StorageSharp" :default StorageSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storage-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StorageSharp)))