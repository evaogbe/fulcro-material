(ns ogbe.fulcro.mui.icons.folder-copy-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FolderCopyRounded" :default FolderCopyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-copy-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderCopyRounded)))