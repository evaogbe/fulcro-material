(ns ogbe.fulcro.mui.icons.folder-delete-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FolderDeleteOutlined" :default FolderDeleteOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-delete-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderDeleteOutlined)))