(ns ogbe.fulcro.mui.icons.folder-shared-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FolderSharedRounded" :default FolderSharedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-shared-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderSharedRounded)))