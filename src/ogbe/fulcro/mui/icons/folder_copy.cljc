(ns ogbe.fulcro.mui.icons.folder-copy
  #?(:cljs (:require
            ["@mui/icons-material/FolderCopy" :default FolderCopy]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-copy
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderCopy)))