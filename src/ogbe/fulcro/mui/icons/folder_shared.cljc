(ns ogbe.fulcro.mui.icons.folder-shared
  #?(:cljs (:require
            ["@mui/icons-material/FolderShared" :default FolderShared]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-shared
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderShared)))