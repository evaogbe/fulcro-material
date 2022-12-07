(ns ogbe.fulcro.mui.icons.folder-delete-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FolderDeleteRounded" :default FolderDeleteRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-delete-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderDeleteRounded)))