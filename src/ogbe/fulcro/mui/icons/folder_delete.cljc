(ns ogbe.fulcro.mui.icons.folder-delete
  #?(:cljs (:require
            ["@mui/icons-material/FolderDelete" :default FolderDelete]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-delete
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderDelete)))