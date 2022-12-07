(ns ogbe.fulcro.mui.icons.folder-delete-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FolderDeleteSharp" :default FolderDeleteSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-delete-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderDeleteSharp)))