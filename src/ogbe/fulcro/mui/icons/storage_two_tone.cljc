(ns ogbe.fulcro.mui.icons.storage-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/StorageTwoTone" :default StorageTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storage-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StorageTwoTone)))